package Bai3_SV_ArrayLIsst;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudyClass studyClass = new StudyClass();
        input(studyClass);
        output(studyClass);
        System.out.println("---------------------------------------------------------");
        System.out.println("Sinh vien khoa k15 : ");
        findCourse(studyClass,15);
        System.out.println("---------------------------------------------------------");
        System.out.println("Sap xep tang dan : ");
        // sap xep tawng dan
//        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma SV","fullName","BirthDay","HomeTown","Specialized","Course");
//        for(int i=0;i<a.getN();i++) {
//            for(int j=i+1;j<a.getN();j++){
//                if(studentList.get(i).getCourse()>studentList.get(j).getCourse()){
//                    Student gan = studentList.get(i);
//                    studentList.set(i,studentList.get(j));
//                    studentList.set(j,gan);
//                }
//            }
//        }
//        for(int i =0;i<a.getN();i++){
//            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20d\n",studentList.get(i).getMaSV(),studentList.get(i).getFullName(),studentList.get(i).getBirthDay(),studentList.get(i).getHometown(),studentList.get(i).getSpecialized(),studentList.get(i).getCourse());
//        }
    }

    private static void input(StudyClass studyClass){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ma LH : ");  studyClass.setMaLH(sc.nextLine());
        System.out.print("Enter name LH : ");   studyClass.setNameLH(sc.nextLine());
        System.out.print("Enter Start date : "); studyClass.setStartDay(sc.nextLine());
        System.out.print("Enter n  = ");  studyClass.setN(sc.nextInt());
        ArrayList<Student> students = new ArrayList<>();
        for(int i =0;i<studyClass.getN();i++){
            System.out.println("Enter thong tin sinh vien " + i);
            Student student = new Student();
            sc.nextLine();
            System.out.print("Enter Ma SV : "); student.setMaSV(sc.nextLine());
            System.out.print("ENter ho ten : "); student.setFullName(sc.nextLine());
            System.out.print("ENter ngay sinh : "); student.setBirthDay(sc.nextLine());
            System.out.print("ENter Que quan : "); student.setHometown(sc.nextLine());
            System.out.print("ENter nganh : "); student.setSpecialized(sc.nextLine());
            System.out.print("ENter Khoa hoc : "); student.setCourse(sc.nextInt());
            students.add(student);
        }
        studyClass.setX(students);
        sc.nextLine();
        System.out.println("Enter ten co giao : " );
        studyClass.setTeacher(sc.nextLine());
    }

    private static void output(StudyClass studyClass) {
        System.out.println("-----------------------------------------------");
        System.out.println(" Ma LH : " + studyClass.getMaLH());
        System.out.println(" name LH : " + studyClass.getNameLH());
        System.out.println(" Start date : " + studyClass.getStartDay()); ;
        System.out.println();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma SV","fullName","BirthDay","HomeTown","Specialized","Course");
        for(Student student : studyClass.getX()){
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20d\n",
                   student.getMaSV(),
                   student.getFullName(),
                   student.getBirthDay(),
                   student.getHometown(),
                   student.getSpecialized(),
                   student.getCourse());
        }
    }
    private static void findCourse(StudyClass studyClass,int khoaHoc){
        for(Student student : studyClass.getX())
            if(student.getCourse() == khoaHoc){
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20d\n",
                        student.getMaSV(),
                        student.getFullName(),
                        student.getBirthDay(),
                        student.getHometown(),
                        student.getSpecialized(),
                        student.getCourse());
            }
    }

    private static void sortCreate(StudyClass studyClass){

    }
}
