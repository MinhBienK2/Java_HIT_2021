package Bai2;

import java.util.Scanner;

public class Date {
    Scanner sc = new Scanner(System.in);
    private int d;
    private int m;
    private int y;

    public void input() {
        System.out.print("Enter days :");
        setD(sc.nextInt());
        System.out.print("Enter months :");
        setM(sc.nextInt());
        System.out.print("Enter years :");
        setY(sc.nextInt());
    }

    public void output() {
        System.out.print(getD()+"/"+getM()+"/"+getY());
    }

    public Date() {}

    public Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
