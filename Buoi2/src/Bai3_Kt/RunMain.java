package Bai3_Kt;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum=0;
        int count=0;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)>='0' && str.charAt(i)<='9' )
            {
                count++;
                sum+=Character.getNumericValue(str.charAt(i)) ;
            }
        if(count==0)
            System.out.println("false");
        else
            System.out.println((double)sum/count);
            System.out.println("true");




    }

}
