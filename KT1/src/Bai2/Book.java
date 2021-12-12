package Bai2;

import java.util.Scanner;

public class Book extends Document{
    Scanner sc = new Scanner(System.in);
    private int numberOfPage;
    private String author;

    public void input(){
        super.input();
        System.out.print("Enter so trang :");
        numberOfPage = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Author : ");
        author = sc.nextLine();
    }

    public void output() {
        super.output();
        System.out.printf("%-20d%-20s\n",numberOfPage,author);
    }

    @Override
    public void edit(){
        super.edit();
        System.out.print("Enter so trang :");
        numberOfPage = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Author : ");
        author = sc.nextLine();
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
