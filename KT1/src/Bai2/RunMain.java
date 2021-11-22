package Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can chon : 1 Add book\n" +
                "2 Edit book by id\n" +
                "3 Delete book by id\n" +
                "4 Sort books by name (ascending)\n" +
                "5 Sort books by price (descending)\n" +
                "6 Show all books\n" +
                "7 Exit.\n");
//        Book book = new Book();
        int n = sc.nextInt();
        switch(n){
            case 1: {
                Book book = new Book();
                add(book);
                book.xuat();
            }
        }
    }

    private static void add(Book book){
        book.nhap();
    }


//    private static edit(Book book) {
//
//    }
}
