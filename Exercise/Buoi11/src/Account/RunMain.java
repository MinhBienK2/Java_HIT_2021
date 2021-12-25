package Account;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    static List<Account> accounts = new ArrayList<>();
    static String regUserName = "^[a-zA-Z0-9]+$";
    static String regPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])[A-Za-z0-9@#$%^&+=]{8,}$";
    static String regPhone = "^[0-9\\-\\+]{9,15}$";
    static String regEmail = "[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}";
    static Pattern patternUserName = Pattern.compile(regUserName);
    static Pattern patternPassword = Pattern.compile(regPassword);
    static Pattern patternPhone = Pattern.compile(regPhone);
    static Pattern patternEmail = Pattern.compile(regEmail);

    public static void main(String[] args) throws IOException{

        int select = 4;
        do{
            System.out.println("1.Create new account.\n" +
                    "2.Login to an existing account.\n" +
                    "3.Sort accounts by username.\n" +
                    "4.Exit.\n");
            System.out.print("Enter my select = "); select = sc.nextInt();
            switch(select){
                case 1 : {
                    createNewAccount();
                    break;
                }
                case 2 : {
                    loginAccount();
                    break;
                }
                case 3 : {
                    sortAccountByUsername();
                    break;
                }
                case 4 : {
                    System.out.println("Thank you for used !");
                    break;
                }
            }
        }while(select!=4);
    }


    private static void createNewAccount() throws IOException {
        Account account = new Account();
        Scanner scanner = new Scanner(Paths.get("ACC.txt"));
        List<Account> userList = new ArrayList<>();
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            String []a = s.split("\\|");
            userList.add(new Account(Integer.parseInt(a[0]),a[1],a[2],a[3],a[4],a[5],a[6]));
        }
        account.setId(userList.size()+1);
        sc.nextLine();
        System.out.print("Enter fullName : ");account.setFullName(sc.nextLine());
        do{
            System.out.print("Enter username : ");account.setUsername(sc.nextLine());
        }while(!patternUserName.matcher(account.getUsername()).find());
        do{
            System.out.print("Enter password : ");account.setPassword(sc.nextLine());
        }while(!patternPassword.matcher(account.getPassword()).find());
        String confirm;
        do{
            System.out.print("Enter confirm :"); confirm = sc.nextLine();
        }while(confirm.compareTo(account.getPassword())!=0);
        do{
            System.out.print("Enter Email : ");account.setEmail(sc.nextLine());
        }while(!patternEmail.matcher(account.getEmail()).find());
        do{
            System.out.print("Enter PhoneNumber : ");account.setPhone(sc.nextLine());
        }while(!patternPhone.matcher(account.getPhone()).find());
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        account.setCreateAt(formatter.format(date));
        accounts.add(account);
        FileWriter fileWriter = new FileWriter("ACC.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        printWriter.println(account.getId() + "|" +account.getFullName() + "|" + account.getUsername() + "|" + account.getPassword()  + "|" + account.getEmail() + "|" + account.getPhone()  + "|" + account.getCreateAt());
        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
        scanner.close();
    }
    private static void loginAccount() throws IOException {
        Scanner scanner = new Scanner(Paths.get("ACC.txt"));
        List<Account> userList = new ArrayList<>();
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            String []a = s.split("\\|");
            userList.add(new Account(Integer.parseInt(a[0]),a[1],a[2],a[3],a[4],a[5],a[6]));
        }
        boolean isCheck = false;
        int isID=-1;
        do{
            Account acc = new Account();
            sc.nextLine();
            System.out.print("Enter Username :");  acc.setUsername(sc.nextLine());
            System.out.print("Enter password :");  acc.setPassword(sc.nextLine());
            for(Account user : userList){
                if(acc.getUsername().equals(user.getUsername()) && acc.getPassword().equals(user.getPassword())){
                    isCheck= true;
                    isID = (int)user.getId();
                }
            }
        }while(isCheck == false);
        int option = 0;
        do{
            System.out.println("1.Show info.\n" +
                    "2.Change password.\n");
            System.out.print("Enter option  = "); option = sc.nextInt();
            switch(option){
                case 1 :{
                    ShowInfo();
                    break;
                }
                case 2 :{
//                                ChangePassword();
                    Account acc1 = new Account();
                    do{
                        sc.nextLine();
                        System.out.print("Enter confirm password :");  acc1.setPassword(sc.nextLine());
                    }while(acc1.getPassword() != acc1.getPassword());
                    userList.get(isID-1).setPassword(acc1.getPassword());
                    FileWriter fileWriter = new FileWriter("ACC.txt",false);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    PrintWriter printWriter = new PrintWriter(bufferedWriter);
                    for(Account user : userList)
                        printWriter.println(user.getId() + "|" +user.getFullName() + "|" + user.getUsername() + "|" + user.getPassword()  + "|" + user.getEmail() + "|" + user.getPhone()  + "|" + user.getCreateAt());
                    printWriter.close();
                    bufferedWriter.close();
                    fileWriter.close();
                    scanner.close();
                    break;
                }
            }
        }while(option!=1 && option!=2);
        scanner.close();

    }

    private static void sortAccountByUsername() throws IOException {
        Scanner scanner = new Scanner(Paths.get("ACC.txt"));
        List<Account> userList = new ArrayList<>();
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            String []a = s.split("\\|");
            userList.add(new Account(Integer.parseInt(a[0]),a[1],a[2],a[3],a[4],a[5],a[6]));
        }
        Collections.sort(userList, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o1.getUsername().compareTo(o2.getUsername());
            }
        });
        for(Account acc : userList)
            System.out.println(acc);
        scanner.close();
    }

    private static void ShowInfo() throws IOException {
        Scanner scanner = new Scanner(Paths.get("ACC.txt"));
        List<Account> userList = new ArrayList<>();
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            String []a = s.split("\\|");
            userList.add(new Account(Integer.parseInt(a[0]),a[1],a[2],a[3],a[4],a[5],a[6]));
        }
        System.out.println(userList);
        scanner.close();
    }

    private static void ChangePassword() throws IOException {
        Scanner scanner = new Scanner(Paths.get("ACC.txt"));
        List<Account> userList = new ArrayList<>();
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            String []a = s.split("\\|");
            userList.add(new Account(Integer.parseInt(a[0]),a[1],a[2],a[3],a[4],a[5],a[6]));
        }
        boolean isCheck = false;
        do{
            Account acc = new Account();
            sc.nextLine();
            System.out.print("Enter confirm password :");  acc.setPassword(sc.nextLine());
            for(Account user : userList){
                if(acc.getPassword().equals(user.getPassword()))
                    isCheck= true;
            }
        }while(isCheck == false);
        Account changePasswork = new Account();
        do{
            System.out.print("Enter change password : ");changePasswork.setPassword(sc.nextLine());
        }while(!patternPassword.matcher(changePasswork.getPassword()).find());


//        FileWriter fileWriter = new FileWriter("ACC.txt",true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        PrintWriter printWriter = new PrintWriter(bufferedWriter);
//        printWriter.println(account.getId() + "|" +account.getFullName() + "|" + account.getUsername() + "|" + account.getPassword()  + "|" + account.getEmail() + "|" + account.getPhone()  + "|" + account.getCreateAt());
//        printWriter.close();
//        bufferedWriter.close();
//        fileWriter.close();
//        scanner.close();
    }

//    private static <userList> List<Account> takeAccount(userList) throws IOException {
//        Scanner scanner = new Scanner(Paths.get("ACC.txt"));
//        List<Account> userList = new ArrayList<>();
//        while(scanner.hasNext()){
//            String s = scanner.nextLine();
//            String []a = s.split("\\|");
//            userList.add(new Account(Integer.parseInt(a[0]),a[1],a[2],a[3],a[4],a[5],a[6]));
//        }
//        Account account = new Account();
//        do{
//            System.out.print("Enter Change password : ");account.setPassword(sc.nextLine());
//        }while(!patternPassword.matcher(account.getPassword()).find());
//        userList.get(0).setPassword(account.getPassword());
//    }
}
