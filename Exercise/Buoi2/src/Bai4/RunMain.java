package Bai4;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=ChuanHoaChuoi(s);
        System.out.println("Chuỗi sau khi chuẩn hóa: "+ s);

    }
    public static String ChuanHoaChuoi(String s){
        String strResult = s.trim();
        while(strResult.contains("  ")==true)
            strResult=strResult.replace("  "," ");
        String[] temp=strResult.split(" ");
        strResult="";
        for(int i=0;i<temp.length;i++){
            strResult+=temp[i].substring(0,1).toUpperCase()+temp[i].substring(1).toLowerCase()+" ";
        }
        strResult=strResult.trim();
        return strResult;
    }
}