package Bai2_Phieu;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    Scanner sc = new Scanner(System.in);
    private String maP;
    private String nameP;
    private DateTime a;
    private ArrayList<SanPham> x;
    private int n;

    public void input() {
        System.out.print("Enter Ma Phieu : "); maP = sc.nextLine();
        System.out.print("Enter Ten Phieu : "); nameP = sc.nextLine();
        a = new DateTime();
        a.input();
        System.out.print("Enter n = "); n =sc.nextInt();
        x = new ArrayList<>();
        for(int i =0;i<n;i++)
        {
            SanPham sp = new SanPham();
            sp.input();
            x.add(sp);
        }
    }

    public void output() {
        System.out.printf("%-20s%-20s",maP,nameP);
        a.output();
        for(int i=0;i<n;i++)
            x.get(i).output();
    }

    public Phieu() {
    }

    public Phieu(Scanner sc, String maP, String nameP, DateTime a, ArrayList<SanPham> x, int n) {
        this.sc = sc;
        this.maP = maP;
        this.nameP = nameP;
        this.a = a;
        this.x = x;
        this.n = n;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public DateTime getA() {
        return a;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public ArrayList<SanPham> getX() {
        return x;
    }

    public void setX(ArrayList<SanPham> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
