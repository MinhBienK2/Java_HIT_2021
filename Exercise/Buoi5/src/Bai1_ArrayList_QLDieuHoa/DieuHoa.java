package Bai1_ArrayList_QLDieuHoa;

import java.util.Scanner;

public class DieuHoa extends SanPham{
    Scanner sc = new Scanner(System.in);
    private int wattage;
    private double price;

    public void input() {
        super.input();
        System.out.print("Enter wattage : "); wattage = sc.nextInt();
        System.out.print("Enter price : "); price = sc.nextDouble();
    }
    public void output() {
        super.output();
        System.out.printf("%-15d%-15f",wattage,price);
    }

    public DieuHoa() {
    }

    public DieuHoa(String maSP, String nameSP, String nameHSX, String dateInput) {
        super(maSP, nameSP, nameHSX, dateInput);
    }

    public DieuHoa(int wattage, double price) {
        this.wattage = wattage;
        this.price = price;
    }

    public DieuHoa(String maSP, String nameSP, String nameHSX, String dateInput, int wattage, double price) {
        super(maSP, nameSP, nameHSX, dateInput);
        this.wattage = wattage;
        this.price = price;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
