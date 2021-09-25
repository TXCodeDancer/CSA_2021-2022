
/*
 ** @project Unit03.BooleansExpressions.IfStatements
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/25/2021
 */

public class Main
{
    public static void main(String[] args)
    {
        int x, y;
        x = 1;
        y = 1;
        System.out.println();
        System.out.println("isPositive():");
        System.out.println("isPositive(" + x + "): " + BooleanExpressions.isPositive(x));

        System.out.println();
        System.out.println("isNegative():");
        System.out.println("isNegative(" + x + "): " + BooleanExpressions.isNegative(x));

        System.out.println();
        System.out.println("isEven():");
        System.out.println("isEven(" + x + "): " + BooleanExpressions.isEven(x));

        System.out.println();
        System.out.println("isOdd():");
        System.out.println("isOdd(" + x + "): " + BooleanExpressions.isOdd(x));

        System.out.println();
        System.out.println("isMultipleOf():");
        System.out.println("isMultipleOf(" + x + ", " + y + "): " + BooleanExpressions.isMultipleOf(x, y));

    }
}
