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
        List<Integer> primes = Maths.getPrimes(127, 200);
        this.p = getRandomPrime(primes);
        this.q = getRandomPrime(primes);
        setFields();
    }

    public PublicKey(int p, int q)
    {
        this.p = p;
        this.q = q;
        setFields();
    }

    private void setFields()
    {
        // Compute n
        this.n = p * q;

        // Compute phi_n
        this.phi_n = (p - 1) * (q - 1);

        // Find e
        findE();
    }

    private int getRandomPrime(List<Integer> primes)
    {
        int index = (int)(Math.random()*primes.size());
        int randomPrime = primes.get(index);
        primes.remove(index);
        return randomPrime;
    }

    private void findE()
    {
        List<Integer> primes = Maths.getPrimes(1, phi_n);
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
