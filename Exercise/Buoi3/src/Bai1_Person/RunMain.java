package Bai1_Person;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person("bien",10 , "nam","ban chim");
        Person p2 = new Person();
        System.out.println("Nhap thong tin ------------");
        System.out.print("Enter Name : ");
        String names = sc.nextLine();
        System.out.print("Enter age : ");
        int ages  = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter gender : ");
        String genders  = sc.nextLine();
//        sc.nextLine();
        System.out.print("Enter hobby : ");
        String hobbys  = sc.nextLine();
//        sc.nextLine();
        System.out.print(p1.toString());
        p2.setName(names);
        p2.setAge(ages);
        p2.setGender(genders);
        p2.setHobby(hobbys);
        System.out.println(p1.toString());
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getGender());
        System.out.println(p2.getHobby());
    }
}
