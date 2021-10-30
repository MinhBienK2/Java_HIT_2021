package Bai4_WoldString;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        str = str.replaceAll("[0-9]","");
        str = str.replaceAll(" +", " ");
        str = str.toLowerCase();
        String[] s = str.split("");
        String strResult = "";
//        str = "";
        for(int i=0;i<s.length;i++)
            strResult +=s[i].substring(0,1).toUpperCase()+s[i].substring(1).toLowerCase();
        System.out.println(strResult);
    }
    private int name;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
