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
        int[] codedMessage = rsa.encode("This is a test!");

        for(long c : codedMessage)
        {
            System.out.print(c + ", ");
        }
        System.out.println();

        String decodedMessage = rsa.decode(codedMessage);
        System.out.println(decodedMessage);
    }
}
