
/*
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 10/16/2021
 */

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println();

        System.out.println("isPrime(3) = " + Maths.isPrime(3));
        System.out.println("isPrime(4) = " + Maths.isPrime(4));
        System.out.print("Primes from 10 to 20: ");
        List<Integer> primes = Maths.getPrimes(10, 20);
        for(Integer i: primes)
        {
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.print("Primes up to 20: ");
        primes = Maths.getPrimes(20);
        for(Integer i: primes)
        {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("11^13 modulo 17 = " + Maths.powerMod(11, 13, 17));

        System.out.println();
    }
}
