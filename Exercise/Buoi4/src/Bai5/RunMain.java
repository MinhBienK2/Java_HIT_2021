package Bai5;

public class RunMain {
    public static boolean isPrime(int n) {
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static boolean isPrime(long n) {
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static boolean isPrime(float n) {
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static boolean isPrime(double n) {
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(123456781));
        System.out.println(isPrime(3.7));
        System.out.println(isPrime(123456789.987654321));
    }
}
