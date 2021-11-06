package Bai3;

import java.util.Scanner;

public class Hang {
    Scanner sc = new Scanner(System.in);
    private String MaHang;
    private String tenHang;
    private double dg;

    public void input() {
        System.out.print("Enter Ma hang : ");
        setMaHang(sc.nextLine());
        System.out.print("Enter ten hang : ");
        setTenHang(sc.nextLine());
        sc.nextLine();
        System.out.print("Enter Don gai : ");
        setDg(sc.nextDouble());
    }

    public void output() {
        System.out.printf("%-20s%-20s%-20.3f",getMaHang(),getTenHang(),getDg());
    }

    public Hang() {
    }

    public Hang(String maHang, String tenHang, double dg) {
        MaHang = maHang;
        this.tenHang = tenHang;
        this.dg = dg;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String maHang) {
        MaHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDg() {
        return dg;
    }

    public void setDg(double dg) {
        this.dg = dg;
    }
}
