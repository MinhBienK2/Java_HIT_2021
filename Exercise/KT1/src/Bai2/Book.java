package Bai2;

import java.util.Scanner;

public class Book extends Document{
    Scanner sc = new Scanner(System.in);
    private int numberOfPage;
    private String author;

    public void nhap(){
        System.out.print("Enter id : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name :");
        name = sc.nextLine();
        System.out.print("Enter publisher :");
        publisher = sc.nextLine();
        System.out.print("Enter price : ");
        price = sc.nextDouble();
        System.out.print("Enter so trang :");
        numberOfPage = sc.nextInt();
        System.out.print("Enter Author : ");
        author = sc.nextLine();
        sc.nextLine();
    }

    public void xuat() {
        System.out.printf("%-20d%-20s%-20s%-20f%-20d%-20s",id,name,publisher,price,numberOfPage,author);
    }

    public Book() {
    }

    public Book(int numberOfPage, String author) {
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public Book(int id, String name, String publisher, double price, int numberOfPage, String author) {
        super(id, name, publisher, price);
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
