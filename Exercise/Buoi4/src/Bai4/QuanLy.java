package Bai4;

import java.util.Scanner;

public class QuanLy {
    Scanner sc = new Scanner(System.in);
    private String maQL;
    private String fullName;

    public void input() {
        System.out.print("Enter ma quan li :");
        setMaQL(sc.next());
        System.out.print("Enter ho va ten :");
        setFullName(sc.next());
    }

    public void output() {
        System.out.printf("Ma quan ly : %-20s Ho ten : %-20s\n",getMaQL(),getFullName());
    }

    public QuanLy() {
    }

    public QuanLy(String maQL, String fullName) {
        this.maQL = maQL;
        this.fullName = fullName;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
