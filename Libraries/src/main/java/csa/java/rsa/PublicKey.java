package csa.java.rsa;
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

import java.util.List;

/**
 * The type Public key.
 */
public class PublicKey
{
    private int e = Integer.MIN_VALUE;
    private int n = Integer.MIN_VALUE;
    private int p;
    private int q;
    private int phi_n;

    /**
     * Instantiates a new Public key.
     */
    public PublicKey()
    {
        // Select primes p and q between 20 - 100
        List<Integer> primes = Maths.getPrimes(20, 100);
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

    /**
     * Gets n.
     *
     * @return the n
     */
    public int getN()
    {
        return n;
    }

    /**
     * Gets e.
     *
     * @return the e
     */
    public int getE()
    {
        return e;
    }

    /**
     * Gets phi n.
     *
     * @return the phi n
     */
    public int getPhi_n()
    {
        return phi_n;
    }
}
