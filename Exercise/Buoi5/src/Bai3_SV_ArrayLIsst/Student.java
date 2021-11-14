package Bai3_SV_ArrayLIsst;

import java.util.Scanner;

public class Student extends People{
    private String maSV;
    private String specialized;
    private int course;

    public Student(){
    }

    public Student(String fullName, String birthDay, String hometown, String maSV, String specialized, int course) {
        super(fullName, birthDay, hometown);
        this.maSV = maSV;
        this.specialized = specialized;
        this.course = course;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
