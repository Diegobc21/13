package sample;

public class Finder {
    public static boolean isPrime(long n){
        if (n < 2) return false;

        for (int i=2;i<=n/2;i++){
            if (n%i==0) return false;
        }
        return true;
    }
}
