package csa.java.rsa;
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

import java.util.ArrayList;
import java.util.List;

/**
 * The type Maths.
 */
public class Maths
{
    /**
     * Is prime boolean.
     *
     * @param n the n
     * @return the boolean
     */
    public static boolean isPrime(Integer n)
    {
        if(n <= 1)
            return false;

        int i = 2;
        while(i <= n/2)
        {
            if((n % i == 0))
                return false;

            i++;
        }

        return true;
    }

    /**
     * Gets primes.
     *
     * @param from the from
     * @param to   the to
     * @return the primes
     */
    public static List<Integer> getPrimes(Integer from, Integer to)
    {
        List<Integer> primes = new ArrayList<>();
        for (Integer i = from; i < to; i++)
        {
            if (isPrime(i))
            {
                primes.add(i);
            }
        }

        return primes;
    }

    /**
     * Gets primes.
     *
     * @param upTo the up to
     * @return the primes
     */
    public static List<Integer> getPrimes(Integer upTo)
    {
        return getPrimes(0, upTo);
    }

    public static int powerMod(int x, int y, int p)
    {
        // https://www.geeksforgeeks.org/modular-exponentiation-power-in-modular-arithmetic/
        int result = 1; // Initialize result

        x = x % p; // Update x if it is more than or
        // equal to p

        if (x == 0)
            return 0; // In case x is divisible by p;

        while (y > 0)
        {

            // If y is odd, multiply x with result
            if ((y & 1) != 0)
                result = (result * x) % p;

            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return result;
    }


}
