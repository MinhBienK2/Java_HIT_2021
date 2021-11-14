package Bai3_SV_ArrayLIsst;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudyClass a = new StudyClass();
//        Input class
        System.out.print("Enter Ma LH : ");  a.setMaLH(sc.nextLine());
        System.out.print("Enter name LH : ");   a.setNameLH(sc.nextLine());
        System.out.print("Enter Start date : "); a.setStartDay(sc.nextLine());
//        Input Sinh vien
        ArrayList<Student> studentList = new ArrayList<>();
        System.out.print("Enter n  = ");  a.setN(sc.nextInt());
        for(int i =0;i<a.getN();i++){
            Student student = new Student();
            sc.nextLine();
            System.out.print("Enter Ma SV : "); student.setMaSV(sc.nextLine());
            System.out.print("ENter ho ten : "); student.setFullName(sc.nextLine());
            System.out.print("ENter ngay sinh : "); student.setBirthDay(sc.nextLine());
            System.out.print("ENter Que quan : "); student.setHometown(sc.nextLine());
            System.out.print("ENter nganh : "); student.setSpecialized(sc.nextLine());
            System.out.print("ENter Khoa hoc : "); student.setCourse(sc.nextInt());
            studentList.add(student);
        }
//          Xuat -------------------------------------------
        System.out.println("-----------------------------------------------");
        System.out.println(" Ma LH : " + a.getMaLH());
        System.out.println(" name LH : " + a.getNameLH());
        System.out.println(" Start date : " + a.getStartDay()); ;
        System.out.println();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma SV","fullName","BirthDay","HomeTown","Specialized","Course");
        for(int i =0;i<a.getN();i++){
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20d\n",studentList.get(i).getMaSV(),studentList.get(i).getFullName(),studentList.get(i).getBirthDay(),studentList.get(i).getHometown(),studentList.get(i).getSpecialized(),studentList.get(i).getCourse());
        }

        // tim khoa 15
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma SV","fullName","BirthDay","HomeTown","Specialized","Course");
        for(int i=0;i<a.getN();i++){
            if(studentList.get(i).getCourse() == 15)
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20d\n",studentList.get(i).getMaSV(),studentList.get(i).getFullName(),studentList.get(i).getBirthDay(),studentList.get(i).getHometown(),studentList.get(i).getSpecialized(),studentList.get(i).getCourse());
        }
        System.out.println();
        // sap xep tawng dan
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma SV","fullName","BirthDay","HomeTown","Specialized","Course");
        for(int i=0;i<a.getN();i++) {
            for(int j=i+1;j<a.getN();j++){
                if(studentList.get(i).getCourse()>studentList.get(j).getCourse()){
                    Student gan = studentList.get(i);
                    studentList.set(i,studentList.get(j));
                    studentList.set(j,gan);
                }
            }
        }
        for(int i =0;i<a.getN();i++){
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20d\n",studentList.get(i).getMaSV(),studentList.get(i).getFullName(),studentList.get(i).getBirthDay(),studentList.get(i).getHometown(),studentList.get(i).getSpecialized(),studentList.get(i).getCourse());
        }
    }
}
