package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTest {

    @Test
    public void testPrimes() {
        Assert.assertTrue(Primes.isPrime(2));
    }

    @Test
    public void testNonPrime() {
        Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE -2));
    }

}
