package Bai2_Array;

import java.util.Scanner;

public class Array {
    public static Scanner sc = new Scanner(System.in);
//    Scanner sc = new Scanner(System.in);
    private int[] a;
    private int n;

    public Array() {
        n = 0;
        a= null;
    }

    public Array(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void inputData() {
        System.out.print("Enter n = ");
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }

    public void show() {
        for(int i=0;i<n;i++) {
            System.out.print(a[i] + " ");
        }
    }

    public int sum() {
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        return sum;
    }

    public void filter(boolean flag) {
            for(int i=0;i<n;i++) {
                if(flag) {
                    if(a[i]%2==0)
                        System.out.print(a[i] + " ");
                }
                else
                    if(a[i]%2!=0)
                        System.out.print(a[i] + " ");
            }
    }

    public double TBC() {
        return (double)sum()/n;
    }


}
