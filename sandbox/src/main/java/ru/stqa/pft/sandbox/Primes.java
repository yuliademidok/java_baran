package ru.stqa.pft.sandbox;

public class Primes {
    public static boolean isPrime(int n) {
        int m = (int)Math.sqrt(n);
        for(int i = 2; i <= m / 2; i++) {
            if (n % i == 0) {return false;}
        }
        return true;
    }
}
