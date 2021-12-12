package Bai2;

import java.util.Scanner;

public class Document {
    Scanner sc = new Scanner(System.in);
    protected int id;
    protected String name;
    protected String publisher;
    protected double price;

    public void input(){
        System.out.print("Enter id : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name :");
        name = sc.nextLine();
        System.out.print("Enter publisher :");
        publisher = sc.nextLine();
        System.out.print("Enter price : ");
        price = sc.nextDouble();
        sc.nextLine();
    }

    public void output(){
        System.out.printf("%-20d%-20s%-20s%-20f",id,name,publisher,price);
    }

    public void edit() {
        System.out.print("Enter name :");
        name = sc.nextLine();
        System.out.print("Enter publisher :");
        publisher = sc.nextLine();
        System.out.print("Enter price : ");
        price = sc.nextDouble();
        sc.nextLine();
    }

    public Document() {
    }

    public Document(int id, String name, String publisher, double price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
