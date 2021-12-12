package Bai2;

import java.util.*;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();
    public static void main(String[] args) {
        int choose = 0;
        do {
            System.out.println("" +
                    "Nhap so can chon : 1 Add book\n" +
                    "2 Edit book by id\n" +
                    "3 Delete book by id\n" +
                    "4 Sort books by name (ascending)\n" +
                    "5 Sort books by price (descending)\n" +
                    "6 Show all books\n" +
                    "7 Exit.\n");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    addBook();
                    break;
                case 2:
                    editBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    sortName();
                    break;
                case 5:
                    sortPrice();
                    break;
                case 6:
                    showBook();
                    break;
                case 7:
                    System.out.println("Da thoat chuong trinh ");
                    break;
                default:
                    System.out.println("Nhập không đúng trường hợp ");
            }
        }while(choose!=7);
    }
    private static void addBook(){
        Book book = new Book();
        book.input();
        ktID(book.getId());
        books.add(book);
    }

    private static void editBook() {
        if(books.isEmpty()){
            System.out.println("Array list rỗng ! ");
            return ;
        }
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        ktID(id);
        books.forEach(i->{
            if(i.getId()==id)
                i.edit();
        });

    }

    private static void deleteBook() {
        if(books.isEmpty()){
            System.out.println("Array list rỗng ! ");
            return ;
        }
        System.out.println("enter id : ");
        int id = sc.nextInt();
        ktID(id);
        for(int i=0;i<books.size();i++)
            if(books.get(i).getId()==id)
                books.remove(i);
    }

    private static void sortName() {
        if(books.isEmpty()){
            System.out.println("Array list rỗng ! ");
            return ;
        }
//        Collections.sort(books,compareToName);
        Collections.sort(books,new Comparator<Book> (){
            @Override
            public int compare(Book o1,Book o2){
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    private static void sortPrice() {
        if(books.isEmpty()){
            System.out.println("Array list rỗng ! ");
            return ;
        }
        Collections.sort(books,new Comparator<Book> (){
            @Override
            public int compare(Book o1,Book o2){
                if(o1.getPrice()>o2.getPrice()) return -1;
                else if(o1.getPrice() < o2.getPrice()) return 1;
                else return 0;
            }
        });
//        for(int i=0;i<books.size();i++)
//            for(int j=i+1;j<books.size();j++)
//                if(books.get(i).getPrice()<books.get(j).getPrice())
//                    Collections.swap(books,i,j);
    }

    private static void showBook() {
        if(books.isEmpty()){
            System.out.println("Array list rỗng ! ");
            return ;
        }
        System.out.println("Danh sach Books : ");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","id","name","publisher","price","numberPape","Author");
        books.forEach(Book::output);
//        for(int i=0; i<books.size(); i++ ) {
//            books.get(i).output();
//        }
//        for(Book book : books)
//            book.output();
    }

    private static boolean isContain(int id){
//        books.forEach(i->{
//            if(i.getId()==id)
//                return true;
//        });
//        return false;
        for(Book book : books)
            if(book.getId()==id)
                return true;
        return false;
    }
    private static void ktID(int id) {
        if(!isContain(id)){
            System.out.println("Không tồn tại id này ! ");
            return ;
        }
    }

//    static Comparator<Book> compareToName = new Comparator<Book>() {
//        @Override
//        public int compare(Book o1, Book o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//    };
//    static Comparator<Book> compareToPrice = new Comparator<Book>() {
//        @Override
//        public int compare(Book o1, Book o2) {
//            return o2.getPrice().compareTo(o1.getPrice());
//        }
//    };
}
