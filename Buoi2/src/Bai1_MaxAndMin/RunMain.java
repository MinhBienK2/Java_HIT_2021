package Bai1_MaxAndMin;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a : ");
        int a = sc.nextInt();
        System.out.print("Nhap b : ");
        int b = sc.nextInt();
        System.out.print("Nhap c : ");
        int c = sc.nextInt();
        System.out.print("tong la " + max(a,b,c));
    }
    public static int max(int a,int b,int c) {
        if(a>b && a>c)
            return a;
        else if(b>a && b>c)
            return b;
        else return c;
    }
}


