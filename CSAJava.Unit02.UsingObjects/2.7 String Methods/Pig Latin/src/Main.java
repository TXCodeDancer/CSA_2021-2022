
/*
 ** @project CSAJava.Unit02.UsingObjects
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/19/2021
 */

import java.util.Scanner;

public class Main
{
    static private Scanner scanner;

    public static void main(String[] args)
    {
        scanner = new Scanner(System.in);
        System.out.println("Enter some words to convert to Pig Latin:");
        String text = scanner.nextLine();

        String pigLatin = PigLatin.Convert(text);
        System.out.println(pigLatin);
    }
}
