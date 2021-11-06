package Bai2;

import java.util.Scanner;

public class NhanSu {
    Scanner sc = new Scanner(System.in);
    private String maNhanSu;
    private String fullName;
    private Date ns;

    public void input() {
        System.out.print("Nhap ma nhan su :");
        setMaNhanSu(sc.nextLine());
        System.out.print("Nhap ho ten :");
        setFullName(sc.nextLine());
        ns = new Date();
        ns.input();
    }

    public void output () {
        System.out.printf("%-20s%-20s",getMaNhanSu(),getFullName());
        ns.output();
    }
    public NhanSu(){}

    public NhanSu(String maNhanSu, String fullName, Date ns) {
        this.maNhanSu = maNhanSu;
        this.fullName = fullName;
        this.ns = ns;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getNs() {
        return ns;
    }

    public void setNs(Date ns) {
        this.ns = ns;
    }
}
