package Bai1;

import java.util.Scanner;

public class Sach {
    Scanner sc = new Scanner(System.in);
    private String id;
    private String name;
    private String nxb;
    private int NumberP;
    private double price;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id book :");
        id = sc.nextLine();
        System.out.println("Enter name book :");
        name = sc.nextLine();
        System.out.println("Enter nxb :");
        nxb = sc.nextLine();
        System.out.println("Enter number paper :");
        NumberP = sc.nextInt();
        System.out.println("Enter price :");
        price = sc.nextDouble();
    }

    public void output() {
        System.out.printf("%-20s%-20s%-20s%-20d%-20.3f\n",getId(), getName(),getNxb(),getNumberP(),getPrice());
    }

    public Sach(){};

    public Sach(String id, String name, String nxb, int numberP, double price) {
        this.id = id;
        this.name = name;
        this.nxb = nxb;
        NumberP = numberP;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNumberP() {
        return NumberP;
    }

    public void setNumberP(int numberP) {
        NumberP = numberP;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
