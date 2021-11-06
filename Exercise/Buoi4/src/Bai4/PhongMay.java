package Bai4;

import java.util.Scanner;

public class PhongMay {
    Scanner sc = new Scanner(System.in);
    private String maP;
    private String nameP;
    private Double area;
    private QuanLy x;
    private May[] y;
    private int n;

    public void input() {
        System.out.print("Enter ma phong :"); setMaP(sc.next());
        sc.nextLine();
        System.out.print("Enter ten phong :"); setNameP(sc.nextLine());
        System.out.print("Enter Area :"); setArea(sc.nextDouble());
        x = new QuanLy();
        x.input();
        System.out.print("Enter n = "); setN(sc.nextInt());
        y = new May[n];
        for(int i=0;i<n;i++){
            y[i] = new May();
            System.out.println("\t\t\tEnter May "+(i+1)+"");
            y[i].input();
        }
    }

    public void output() {
        System.out.printf("Ma phong : %-20s Ten phong : %-20s \n",getMaP(),getNameP());
        System.out.println(" Area :" + getArea());
        x.output();
        System.out.printf("%-20s%-20s%-20s\n","Ma may ","Kieu may","tinh trang");
        for(int i=0;i<n;i++){
            y[i].output();
        }
    }

    public PhongMay() {
    }

    public PhongMay(String maP, String nameP, Double area, QuanLy x, May[] y, int n) {
        this.maP = maP;
        this.nameP = nameP;
        this.area = area;
        this.x = x;
        this.y = y;
        this.n = n;
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

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
