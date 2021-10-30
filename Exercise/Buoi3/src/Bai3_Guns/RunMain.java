package Bai3_Guns;

import java.util.Random;
import java.util.Scanner;


public class RunMain {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Guns g1 = new Guns("Ak",100);
        Guns g2 = new Guns("M4A1",100);
        Random rn = new Random();

//        System.out.println(n1);
        while(g1.getAmmoNumber()>0 || g2.getAmmoNumber()>0)
        {
            int n1 = rn.nextInt(10) + 1;
            int n2 = rn.nextInt(10) + 1;
            g1.Load(3);
            g1.shoot(n1);
            g2.Load(3);
            g2.shoot(n2);
            if(g1.getAmmoNumber()==0) {
                System.out.println("người choi g1 thua");
                break;
            }
            if(g2.getAmmoNumber()==0) {
                System.out.println("người choi g2 thua");
                break;
            }
        }
    }
}
