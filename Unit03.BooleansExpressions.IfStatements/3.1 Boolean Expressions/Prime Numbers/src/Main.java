
/*
 ** @project Unit03.BooleansExpressions.IfStatements
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/25/2021
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println();
        int number = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Enter a number check: ");
            number = scanner.nextInt();
        } catch (InputMismatchException e)
        {
            System.out.println("That wasn't a number: " + e);
        }

        if(Prime.isPrime(number))
            System.out.println(number + " is prime.");
        else
            System.out.println(number + " is not prime.");

        System.out.println();
        System.out.println("*** Prime Numbers between 0 to 100 ***");
        for (int i = 0; i < 100; i++)
        {
            if (Prime.isPrime(i))
            {
                System.out.print(i + "  ");
            }
        }

        System.out.println();
    }
}
