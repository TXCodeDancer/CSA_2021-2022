package csa.java.rsa;
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

import java.util.ArrayList;
import java.util.List;

public class Prime
{
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

    public static List<Integer> getPrimes(Integer upTo)
    {
        return getPrimes(0, upTo);
    }


}
