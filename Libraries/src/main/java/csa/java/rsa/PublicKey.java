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
    private int phi_n = Integer.MIN_VALUE;

    /**
     * Instantiates a new Public key.
     */
    public PublicKey()
    {
        // Select primes p and q between 127 - 200
        List<Integer> primes = Maths.getPrimes(127, 200);
        this.p = getRandomPrime(primes);
        this.q = getRandomPrime(primes);
        setFields();
    }

    /**
     * Instantiates a new Public key.
     *
     * @param publicKey the public key
     */
    public PublicKey(PublicKey publicKey)
    {
        this.n = publicKey.getN();
        this.e = publicKey.getE();
    }

    /**
     * Instantiates a new Public key.
     *
     * @param p the p
     * @param q the q
     */
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

        for (int i : primes)
        {
            if((phi_n % i) != 0)
            {
                this.e = i;
                return;
            }
        }
    }

    private void findERandom()
    {
        List<Integer> primes = Maths.getPrimes(1, phi_n);

        while(primes.size() > 0)
        {
            int i = getRandomPrime(primes);
            if((phi_n % i) != 0)
            {
                this.e = i;
                return;
            }
        }
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
     * Sets e.
     *
     * @param e the e
     */
    public void setE(int e)
    {
        this.e = e;
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
     * Sets n.
     *
     * @param n the n
     */
    public void setN(int n)
    {
        this.n = n;
    }
}
