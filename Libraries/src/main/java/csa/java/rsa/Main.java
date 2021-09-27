package csa.java.rsa;
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

public class Main
{
    public static void main(String[] args)
    {
        RSA rsa = new RSA();
        long[] message = {0,1,2,3,4,5,6,7,8,9, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(long m : message)
        {
            System.out.print(m + ", ");
        }
        System.out.println();

        long[] encodedMessage = rsa.encode(message);

        for(long e : encodedMessage)
        {
            System.out.print(e + ", ");
        }
        System.out.println();

        long[] decodedMessage = rsa.decode(encodedMessage);
        for(long d : decodedMessage)
        {
            System.out.print(d + ", ");
        }
        System.out.println();
    }
}
