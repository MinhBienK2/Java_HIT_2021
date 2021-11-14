package Bai3_SV_ArrayLIsst;

import java.util.Scanner;

public class People {
    Scanner sc = new Scanner(System.in);
    private String fullName;
    private String birthDay;
    private String hometown;

    public void input() {
        System.out.print("Enter FullName : "); fullName = sc.nextLine();
        System.out.print("Enter birthDay : "); birthDay = sc.nextLine();
        System.out.print("Enter hometown : "); hometown = sc.nextLine();
    }

    public void output() {
        System.out.printf("%-15s%-15s%-15s",fullName,birthDay,hometown);
    }

    public People() {
    }

    public People(String fullName, String birthDay, String hometown) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.hometown = hometown;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
