package Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    static List<News> newLists = new ArrayList<>();
    // static INews news = new News();
//     static News news = new News();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int select = 4;
        do{
            System.out.println("1.Insert news "
                    + "\n2.View list news"
                    + "\n3.Average rate"
                    + "\n4.Exit");
            System.out.print("Enter select : "); select = sc.nextInt();
            switch(select){
                case 1 :{
                    insertNews();
                    break;
                }
                case 2 :{
                    viewListNews();
                    break;
                }
                case 3 :{
                    AverageRate();
                    break;
                }
                case 4 :{
                    System.out.println("Thank you for using");
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + select);
            }
        }while(select!=4);
    }


    private static void insertNews() {
        News news = new News();
        int countID = newLists.size();
        news.setId(countID+1);
        sc.nextLine();
        System.out.print("Enter title :"); news.setTitle(sc.nextLine());
        System.out.print("Enter publishDate :"); news.setPublishDate(sc.nextLine());
        System.out.print("Enter author :"); news.setAuthor(sc.nextLine());
        System.out.print("Enter content :"); news.setContent(sc.nextLine());
        System.out.println("average rate List  ");
        int []array = new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter rateList "+i+" :");
            array[i] = sc.nextInt();
        }
        news.setRateList(array);
//        news.calculate();
        newLists.add(news);
    }

    private static void viewListNews() {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","id","title","publishDate","author","content","averageRate");
        newLists.forEach(ele -> {
            ele.Display();
        });
    }

    private static void AverageRate() {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","id","title","publishDate","author","content","averageRate");
        newLists.forEach(ele -> {
            ele.calculate();
            ele.Display();
        });
    }
}
