package Bai4;

import java.util.Scanner;

public class May {
    Scanner sc = new Scanner(System.in);
    private String maMay;
    private String kieuM;
    private String tt;

    public void input() {
        System.out.println("Enter Ma may :");
        setMaMay(sc.next());
        System.out.println("Enter kieu may :");
        setKieuM(sc.next());
        System.out.println("Enter tinh trang :");
        setTt(sc.next());
    }

    public void output() {
        System.out.printf("%-20s%-20s%-20s\n",getMaMay(),getKieuM(),getTt());
    }

    public May() {
    }

    public May(String maMay, String kieuM, String tt) {
        this.maMay = maMay;
        this.kieuM = kieuM;
        this.tt = tt;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getKieuM() {
        return kieuM;
    }

    public void setKieuM(String kieuM) {
        this.kieuM = kieuM;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }
}
