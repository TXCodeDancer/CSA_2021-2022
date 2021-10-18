
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
            // If exponent is odd, multiply base with result
            if ((exponent % 2) != 0)
                result = (result * base) % modulus;

            // exponent must be even now
            exponent /= 2; // exponent = exponent/2
            base = (base * base) % modulus;
        }
        return result;
    }

    /**
     * Power mod fast int.
     *
     * @param base     the base
     * @param exponent the exponent
     * @param modulus  the modulus
     * @return the int
     */
    public static int powerModFast(int base, int exponent, int modulus)
    {
        // https://www.geeksforgeeks.org/modular-exponentiation-power-in-modular-arithmetic/
        int result = 1; // Initialize result

        base = base % modulus; // Update base if it is more than or equal to modulus

        if (base == 0)
            return 0; // In case base is divisible by modulus;

        while (exponent > 0)
        {
            // If exponent is odd, multiply base with result
            if ((exponent & 0x01) != 0)
                result = (result * base) % modulus;

            // exponent must be even now
            exponent = exponent >> 1; // exponent = exponent/2
            base = (base * base) % modulus;
        }
        return result;
    }
}
