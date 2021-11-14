package Bai1_ArrayList_QLDieuHoa;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ="); int n = sc.nextInt();
        ArrayList<DieuHoa> arr = new ArrayList<DieuHoa>();

        for (int i = 0; i < n; i++) {
            DieuHoa dh = new DieuHoa();
            dh.input();
            arr.add(dh);
        }
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s","ma SP","name SP","name HSX","date","wattage","price");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println();
            arr.get(i).output();
        }
        System.out.println();
        System.out.println("--------------------có tên Hạn sử dụng là Electrolux : ---------------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s","ma SP","name SP","name HSX","date","wattage","price");
        for(int i=0;i<arr.size();i++)
            if(arr.get(i).getNameHSX().equals("Electrolux")){
                System.out.println();
                arr.get(i).output();
            }
        double minPrice = arr.get(0).getPrice();
        for(int i=0;i<n;i++){
            double gan = arr.get(i).getPrice();
            if(gan<minPrice)
            {
                minPrice = gan;
            }
        }
        System.out.println();
        System.out.println("Min : " + minPrice);
    }
}
