package Bai4_Sum;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        //kiểu int
        System.out.println();
        Scanner sc = new Scanner(System.in);
        Sum<Integer> numberInt = new Sum<>();
        System.out.print("enter so nguyen A Kiểu int : ");numberInt.setA(sc.nextInt());
        System.out.print("enter so nguyen B Kiểu int : ");numberInt.setB(sc.nextInt());
        System.out.println("Tong 2 số kiểu Int là : " + (numberInt.getA() + numberInt.getB()));

        // kiểu long
        System.out.println();
        Sum<Long> numberLong = new Sum<>();
        System.out.print("enter so nguyen A Kiểu long : ");numberLong.setA(sc.nextLong());
        System.out.print("enter so nguyen B Kiểu long : ");numberLong.setB(sc.nextLong());
        System.out.println("Tong số 2 kiểu Long là : " + (numberLong.getA() + numberLong.getB()));

        // kiểu float
        System.out.println();
        Sum<Float> numberFloat = new Sum<>();
        System.out.print("enter so nguyen A Kiểu float : ");numberFloat.setA(sc.nextFloat());
        System.out.print("enter so nguyen B Kiểu float : ");numberFloat.setB(sc.nextFloat());
        System.out.println("Tong 2 số kiểu Float là : " + (numberFloat.getA() + numberFloat.getB()));

        // kiểu double
        System.out.println();
        Sum<Double> numberDouble = new Sum<>();
        System.out.print("enter so nguyen A Kiểu double : ");numberDouble.setA(sc.nextDouble());
        System.out.print("enter so nguyen B Kiểu double : ");numberDouble.setB(sc.nextDouble());
        System.out.println("Tong 2 số kiểu Double là : " + (numberDouble.getA() + numberDouble.getB()));

    }

}
