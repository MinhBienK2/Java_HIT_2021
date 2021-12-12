package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        int sum=0;
        for(int i=0;i<str.length();i++)
            if(Character.isDigit(str.charAt(i))){
                count++;

            }
        System.out.println( "có "+count+ " ký tự số");
    }
}
