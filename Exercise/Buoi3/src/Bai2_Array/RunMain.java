package Bai2_Array;

public class RunMain {
    public static void main(String[] args) {
        Array a = new Array();
        Array b = new Array();
        // input / output
        System.out.println("Enter mảng a ");
        a.inputData();
        a.show();
        // Sum
        System.out.println();
        System.out.println("Tổng mảng a là : " + a.sum());
        System.out.print("lọc mảng chẵn hoặc lẻ mảng a : ");
        //filter  even and odd number
        a.filter(false);
        System.out.println();
        System.out.println("Trung binh cộng mảng a :" + a.TBC());
        //-------------------------
        // input / output
        System.out.println();
        System.out.println("Enter mảng b ");
        b.inputData();
        b.show();
        // Sum
        System.out.println();
        System.out.println("Tổng mảng là : " + b.sum());
        System.out.print("lọc mảng chẵn hoặc lẻ : ");
        //filter  even and odd number
        b.filter(false);
        System.out.println();
        System.out.println("Trung binh cộng mảng b :" + b.TBC());
        // ---------------------------- so sánh
        System.out.println();
        if( a.TBC()>b.TBC())
            System.out.println("Mảng a có TBC lơn hơn mảng b");
        else if(a.TBC()<b.TBC())
            System.out.println("Mảng b có TBC lơn hơn mảng a");
        else System.out.println("Bye");
//        int[] c = {1,2,3,4,5};
//        Array b = new Array(c,5);
//        b.show();
    }
}
