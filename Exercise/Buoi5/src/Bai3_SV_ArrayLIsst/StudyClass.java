package Bai3_SV_ArrayLIsst;

import java.util.ArrayList;

public class StudyClass {
    private String maLH;
    private String nameLH;
    private String startDay;
    private ArrayList<Student> x;
    private int n;
    private String teacher;

    public StudyClass() {
    }

    public StudyClass(String maLH, String nameLH, String startDay, ArrayList<Student> x, int n, String teacher) {
        this.maLH = maLH;
        this.nameLH = nameLH;
        this.startDay = startDay;
        this.x = x;
        this.n = n;
        this.teacher = teacher;
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getNameLH() {
        return nameLH;
    }

    public void setNameLH(String nameLH) {
        this.nameLH = nameLH;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public ArrayList<Student> getX() {
        return x;
    }

    public void setX(ArrayList<Student> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
