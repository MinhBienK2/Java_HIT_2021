package Bai2_Selection_Choose;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so lượng phận tử mảng n = ");
        int n = sc.nextInt();
        int []a = new int[n];
        input(a, n);
        int h = 5;
        int m;
        do {
                System.out.println("------------------------------------------");
                System.out.println("\t\t\tMENU");
                System.out.println("\t\t 1. Nhập mảng với n số nguyên");
                System.out.println("\t\t 2. Nhập mảng với n số nguyên");
                System.out.println("\t\t 3. Thêm 1 phần tử vào vị trí k bất kỳ");
                System.out.println("\t\t 4. Xóa 1 phần tử tại vị trí k bất kỳ");
                System.out.println("\t\t 5. Hiển thị mảng đảo ngược");
                System.out.println("\t\t 6. Hiển thị phần tử a[1] và các số chia hết cho a[1]");
                System.out.println("\t\t 7. Xuất ra màn hình tổng các số nguyên tố có trong mảng");
                System.out.println("\t\t 8. Thoát (Khi nhấn thoát thì chương trình mới kết thúc)");
                System.out.print("Enter choose ( 1 -> 8) ");
                m =sc.nextInt();
                switch(m){
                    case 1: {
//                        System.out.print("Nhap n = ");
//                        n = sc.nextInt();
//                        a = new int[n];
                        input(a, n);
                        break;
                    }
                    case 2: {
                        output(a, n);
                        break;
                    }

                    case 3: {
                        // nhap vị trí k và phần tử s
                        System.out.print("Nhap vi tri :");
                        int k = sc.nextInt();
                        System.out.print("Nhap gia tri phan tu s  :");
                        int s = sc.nextInt();
                        insert(a, k, s, n);
                        break;
                    }
                    case 4: {
                        System.out.print("Nhap vi tri :");
                        int k = sc.nextInt();
                        deleteElement(a, k, n);
                        break;

                    }
                    case 5: {
                        reverse(a, n);
                        output(a, n);
                        break;

                    }
                    case 6: {
                        divisor(a, n);
                        break;

                    }
                    case 7: {
                        System.out.print("Tổng của các số nguyên tố trong mảng là : " + prime(a, n));
                        break;

                    }
                    case 8: {
                        return;
                    }
                    default:
                        System.out.println("Nhập sai rồi nhé !");
                }
        }while(h==5);


    }

    private static void selection(int n) {
        switch (n) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
        }
    }

    // nhập
    private static void input(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap n = ");
//        n = sc.nextInt();
//        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    // xuất
    private static void output(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //insert element k
    private static void insert(int[] a, int k, int s, int n) {
        int[] newA = Arrays.copyOf(a, n + 1);
        for (int i = n; i > k - 1; i--) {
            newA[i] = newA[i - 1];
        }
        newA[k - 1] = s;
        output(newA,newA.length);
    }

    // delete element vi tri k
    private static void deleteElement(int[] a, int k, int n) {
        int[] newA = Arrays.copyOf(a,n);
        for (int i = k-1; i < n; i++) {
            newA[i] = newA[i + 1];
        }
        n--;
        output(newA,n);
    }

    // reverse
    private static void reverse(int [] a , int n){
        int j=n-1;
        for(int i=0;i<=Math.floor(n/2);i++) {
            for(;j>=Math.ceil(n/2);j--) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
                break;
            }
        }
    }

    // 6 . so chia het
    private static void divisor(int [] a , int n){
        System.out.println(" Phần tử a[1] = " + a[1]);
        System.out.print("các số chia hết cho a[1] : ");
        for(int i=0;i<n;i++) {
            if(a[i] % a[1] == 0 && a[i] != a[1])
                System.out.print(a[i] + " ");
        }
    }

    // 7 .
    private static int checkPrime(int n){
        if(n<2) return 0;
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return 0;
        return 1;
    }
    private static int prime(int [] a , int n){
        int sum=0;
        for(int i=0;i<n;i++)
            if(checkPrime(a[i])==1)
                sum+=a[i];
        return sum;
    }



}