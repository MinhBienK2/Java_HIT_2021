package BaiTap;

import java.util.*;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    static List<Person> persons = new ArrayList<>();
    public static void main(String[] args) {
        try{
            input();
        }catch(Exception ex){
            System.out.println(ex);
        }
//        Collections.sort(persons);
        System.out.printf("%-20s%-20s%-20s\n","id","name","address");
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getName().compareTo(o2.getName())!=0){
                    return o1.getName().compareTo(o2.getName());
                }
                else return o2.getAddress().compareTo(o1.getAddress());
            }
        });
        output();
    }
    private static void input(){
        System.out.print("Enter n = : "); int n = sc.nextInt();
        for(int i=0;i<n;i++){
            Person person = new Person();
            person.input();
            persons.add(person);
        }
    }
    private static void output(){
        for(int i=0;i<persons.size();i++)
            persons.get(i).disPlay();
    }
}
