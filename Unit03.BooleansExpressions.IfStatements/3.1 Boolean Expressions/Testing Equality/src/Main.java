
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
        System.out.println();
        System.out.println("equals():");
        x = 1;
        y = 1;
        System.out.println("equals(" + x + ", " + y + "): " + BooleanExpressions.equals(x, y));
        x = 0;
        System.out.println("equals(" + x + ", " + y + "): " + BooleanExpressions.equals(x, y));

        System.out.println();
        System.out.println("notEquals():");
        System.out.println("notEquals(" + x + ", " + y + "): " + BooleanExpressions.notEquals(x, y));

        System.out.println();
        System.out.println("lessThan():");
        System.out.println("lessThan(" + x + ", " + y + "): " + BooleanExpressions.lessThan(x, y));

        System.out.println();
        System.out.println("greaterThan():");
        System.out.println("greaterThan(" + x + ", " + y + "): " + BooleanExpressions.greaterThan(x, y));

        System.out.println();
        System.out.println("lessThanEquals():");
        System.out.println("lessThanEquals(" + x + ", " + y + "): " + BooleanExpressions.lessThanEquals(x, y));

        System.out.println();
        System.out.println("greaterThanEquals():");
        System.out.println("greaterThanEquals(" + x + ", " + y + "): " + BooleanExpressions.greaterThanEquals(x, y));
    }
}
