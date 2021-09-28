package csa.java.rsa;
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

import java.util.List;

public class PublicKey
{
    private int e = Integer.MIN_VALUE;
    private int n = Integer.MIN_VALUE;
    private int p;
    private int q;
    private int phi_n;

    public PublicKey()
    {
        // Select primes p and q between 20 - 100
        List<Integer> primes = Prime.getPrimes(20, 100);
        p = getRandomPrime(primes);
        q = getRandomPrime(primes);

        // Compute n
        n = p * q;

        // Compute phi_n
        phi_n = (p-1) * (q-1);

        // Find e
        setE();
    }

    private int getRandomPrime(List<Integer> primes)
    {
        int index = (int)(Math.random()*primes.size());
        int randomPrime = primes.get(index);
        primes.remove(index);
        return randomPrime;
    }

    private void setE()
    {
        List<Integer> primes = Prime.getPrimes(1, phi_n);
        for(int i : primes)
        {
            if((phi_n % i) != 0)
            {
                this.e = i;
                return;
            }
        }
    }

    public int getN()
    {
        return n;
    }

    public int getE()
    {
        return e;
    }

    public int getPhi_n()
    {
        return phi_n;
    }
}
