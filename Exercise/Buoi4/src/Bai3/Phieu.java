package Bai3;

import java.util.Scanner;

public class Phieu {
    Scanner sc = new Scanner(System.in);
    private String maPhieu;
    private Hang[] x;
    private int n;

    public void input() {
        System.out.print("Enter ma phieu : ");
        setMaPhieu(sc.next());
        System.out.print("Enter so Mat Hang n =  ");
        setN(sc.nextInt());
        sc.next();
        x = new Hang[n];
        for(int i=0;i<n;i++) {
            System.out.printf("%30s","Hang "+i+"\n");
            x[i] = new Hang();
            x[i].input();
        }
    }

    public void output() {
        System.out.println(" ma phieu : "+ getMaPhieu());
        System.out.printf("%-20s%-20s%-20s\n","ma hang","ten hang","don gia");
        for(int i=0;i<n;i++) {
            x[i].output();
            System.out.println();
        }
    }

    public Phieu() {
    }

    public Phieu(String maPhieu, Hang[] x, int n) {
        this.maPhieu = maPhieu;
        this.x = x;
        this.n = n;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Hang[] getX() {
        return x;
    }

    public void setX(Hang[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
