
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
        // Reject any number less than the lowest prime number
        if(n <= 1)
            return false;

        // Use a loop to increment control variable from the lowest prime number to one half of n (inclusive).
        // If n is a multiple of the control variable, it cannot be prime so reject it.
        // Otherwise, increment the control variable.
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

        // Use a loop to check all numbers between 'from' and 'to' inclusive.
        // If number is prime, add it to the primes list using primes.add(number)
        // return the list of primes;
        for (Integer i = from; i <= to; i++)
        {
            if (isPrime(i))
            {
                primes.add(i); // Add i to primes list if
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

    /**
     * Power mod int.
     *
     * @param base     the base
     * @param exponent the exponent
     * @param modulus  the modulus
     * @return the int
     */
    public static int powerMod(int base, int exponent, int modulus)
    {
        // https://www.geeksforgeeks.org/modular-exponentiation-power-in-modular-arithmetic/
        int result = 1; // Initialize result

        base = base % modulus; // Update base if it is more than or equal to modulus

        if (base == 0)
            return 0; // In case base is divisible by modulus;

        while (exponent > 0)
        {
            // If exponent is odd, multiply base with result and take modulus
            if ((exponent % 2) != 0)
                result = (result * base) % modulus;

            // exponent must be even now
            exponent /= 2; // Divide exponent by 2
            base = (base * base) % modulus; // Square base and take modulus
        }
        return result; // return answer
    }

}
