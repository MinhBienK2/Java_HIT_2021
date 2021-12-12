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
                sum+=Character.getNumericValue(str.charAt(i));
//                sum+=Integer.parseInt(str.charAt(i));
            }
        int tich =1;
        for(int i=0 ;i<str.length();i++)
            if(sum%Character.getNumericValue(str.charAt(i))==0)
                tich*=Character.getNumericValue(str.charAt(i));
        System.out.println( "có "+count+ " ký tự số");
        System.out.println("tích của các có có ước của tổng là : " +tich);
    }
}
