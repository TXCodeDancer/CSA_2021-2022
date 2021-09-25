
/*
 ** @project Unit03.BooleansExpressions.IfStatements
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/25/2021
 */

public class Prime
{
    public static boolean isPrime(int n)
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
}
