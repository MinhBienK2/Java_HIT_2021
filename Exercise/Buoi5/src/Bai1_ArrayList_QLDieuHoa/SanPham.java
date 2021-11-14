//package Bai1_ArrayList_QLDieuHoa;
//
//import java.util.Scanner;
//
//public class SanPham {
//    Scanner sc = new Scanner(System.in);
//    private String maSP;
//    private String nameSP;
//    private String nameHSX;
//    private String dateInput;
//
//    public SanPham() {
//    }
//
//    public SanPham(String maSP, String nameSP, String nameHSX, String dateInput) {
//        this.maSP = maSP;
//        this.nameSP = nameSP;
//        this.nameHSX = nameHSX;
//        this.dateInput = dateInput;
//    }
//
//    public void input() {
//        System.out.print("Enter ma SP :"); maSP = sc.nextLine();
//        System.out.print("Enter name SP :"); nameSP = sc.nextLine();
//        System.out.print("Enter name HSX :"); nameHSX = sc.nextLine();
//        System.out.print("Enter date :"); dateInput = sc.nextLine();
//    }
//
//    public void output() {
//        System.out.printf("%-15s%-15s%-15s%-15s",maSP,nameSP,nameHSX,dateInput);
//    }
//
//    public String getMaSP() {
//        return maSP;
//    }
//
//    public void setMaSP(String maSP) {
//        this.maSP = maSP;
//    }
//
//    public String getNameSP() {
//        return nameSP;
//    }
//
//    public void setNameSP(String nameSP) {
//        this.nameSP = nameSP;
//    }
//
//    public String getNameHSX() {
//        return nameHSX;
//    }
//
//    public void setNameHSX(String nameHSX) {
//        this.nameHSX = nameHSX;
//    }
//
//    public String getDateInput() {
//        return dateInput;
//    }
//
//    public void setDateInput(String dateInput) {
//        this.dateInput = dateInput;
//    }
//}


package Bai1_ArrayList_QLDieuHoa;

import java.util.Scanner;

public class SanPham {
    Scanner sc = new Scanner(System.in);
    private String maSP;
    private String nameSP;
    private String nameHSX;
    private String dateInput;

    public void input() {
        System.out.print("Enter ma SP :"); maSP = sc.nextLine();
        System.out.print("Enter name SP :"); nameSP = sc.nextLine();
        System.out.print("Enter name HSX :"); nameHSX = sc.nextLine();
        System.out.print("Enter date :"); dateInput = sc.nextLine();
    }

    public void output() {
        System.out.printf("%-15s%-15s%-15s%-15s",maSP,nameSP,nameHSX,dateInput);
    }

    public SanPham() {
    }

    public SanPham(String maSP, String nameSP, String nameHSX, String dateInput) {
        this.maSP = maSP;
        this.nameSP = nameSP;
        this.nameHSX = nameHSX;
        this.dateInput = dateInput;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public String getNameHSX() {
        return nameHSX;
    }

    public void setNameHSX(String nameHSX) {
        this.nameHSX = nameHSX;
    }

    public String getDateInput() {
        return dateInput;
    }

    public void setDateInput(String dateInput) {
        this.dateInput = dateInput;
    }
}


