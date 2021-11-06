package Bai1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        Sach[] s = new Sach[n];
        for(int i =0;i<n;i++){
            s[i] = new Sach();
            s[i].input();
        }
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","id", "name","nsx","phonePaper","price");
        for(int i=0;i<n;i++)
            s[i].output();

    }
}
