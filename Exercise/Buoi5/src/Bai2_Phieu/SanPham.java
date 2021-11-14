package Bai2_Phieu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SanPham {
    Scanner sc = new Scanner(System.in);
    private String maSP , nameSP ;
    private int quantity;
    private double price;

    public void input() {
        System.out.println("Enter ma SP : "); maSP = sc.nextLine();
        System.out.println("Enter name SP : "); nameSP = sc.nextLine();
        System.out.println("Enter quantity : "); quantity = sc.nextInt();
        System.out.println("Enter price : "); price = sc.nextDouble();
    }

    public void output() {
        System.out.println();
        System.out.printf("%-20s%-20s%-20d%-20f%-20f\n",maSP,nameSP,quantity,price,quantity*price);
    }

    public SanPham() {
    }

    public SanPham(Scanner sc, String maSP, String nameSP, int quantity, double price) {
        this.sc = sc;
        this.maSP = maSP;
        this.nameSP = nameSP;
        this.quantity = quantity;
        this.price = price;
    }

    public Scanner getSc() {
        return sc;
    }

//    public void setSc(Scanner sc) {
//        this.sc = sc;
//    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
