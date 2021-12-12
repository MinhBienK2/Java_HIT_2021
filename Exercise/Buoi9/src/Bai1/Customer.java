package Bai1;

public class Customer extends Person{
    private int balance;

    @Override
    public void display() {
        System.out.println("Employee name :" + getName());
        System.out.println("Employee address :" + getAddress());
        System.out.println("Employee balance :" + balance);
    }

    public Customer() {
    }

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }
}
