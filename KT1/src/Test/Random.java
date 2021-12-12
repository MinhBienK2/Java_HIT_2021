package Test;

public class Random {
    public static void main(String[] args) {
        long cmnd;
        System.out.println(random());
    }

    private static double random(){
       double a = Math.floor(Math.random()*1000000000000l);
       return a;
    }
}
