package BaiTap;

import java.util.Scanner;

public class Person implements Comparable<Person>{
    Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private String address;

    @Override
    public int compareTo(Person o) {
        if(getId()>o.getId())
            return 1;
        else if(getId()<o.getId())
            return -1;
        else return 0;
    }

    public void input(){
        System.out.println("enter id :");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name :");
        name = sc.nextLine();
        System.out.println("Enter address : ");
        address = sc.nextLine();
    }

    public void disPlay(){
        System.out.printf("%-20d%-20s%-20s\n",id,name,address);
    }

    public Person() {
    }

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{ id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
