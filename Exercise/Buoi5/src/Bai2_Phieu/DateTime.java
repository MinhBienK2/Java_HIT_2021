package Bai2_Phieu;

import java.util.Scanner;

public class DateTime {
    Scanner sc = new Scanner(System.in);
    private int day;
    private int month;
    private int year;

    public void input() {
        System.out.print("Enter Day : "); day = sc.nextInt();
        System.out.print("Enter month : "); month = sc.nextInt();
        System.out.print("Enter year : "); year = sc.nextInt();
    }

    public void output() {
        System.out.println("date : " + day + "/" + month + "/" + year);
    }

    public DateTime() {
    }

    public DateTime(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
