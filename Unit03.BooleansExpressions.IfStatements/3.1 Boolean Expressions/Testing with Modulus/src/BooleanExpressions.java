
/*
 ** @project Unit03.BooleansExpressions.IfStatements
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/25/2021
 */

public class BooleanExpressions
{
    public static boolean isPositive(int A)
    {
        return (A > 0);
    }

    public static boolean isNegative(int A)
    {
        return (A < 0);
    }

    public static boolean isEven(int A)
    {
        return (A % 2 == 0);
    }

    public static boolean isOdd(int A)
    {
        return (A % 2 != 0);
    }

    public static boolean isMultipleOf(int A, int B)
    {
        return (A % B == 0);
    }

}
