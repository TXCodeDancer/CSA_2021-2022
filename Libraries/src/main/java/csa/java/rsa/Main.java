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
        long[] message = {0,1,2,3,4,5,6,7,8,9, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 210, 220, 221, 222, 223, 224, 225};
        for(long m : message)
        {
            System.out.print(m + ", ");
        }
        System.out.println();

        long[] encodedMessage = rsa.encode(message);

        for(long e : encodedMessage)
        {
            System.out.print(String.format("%02X", e) + ", ");
            String h = Long.toHexString(e);
            long l = Long.parseLong(h, 16);
//            System.out.print(l);

        }
        System.out.println();

        long[] decodedMessage = rsa.decode(encodedMessage);
        for(long d : decodedMessage)
        {
            System.out.print(d + ", ");
        }
        System.out.println();

        ///////////////////////////////////
        System.out.println();
        String planText = "This is a test!";
        System.out.println(planText);

        encodedMessage = rsa.encode(planText);

        for(long e : encodedMessage)
        {
            System.out.print(String.format("%02X", e));
            String h = Long.toHexString(e);
            long l = Long.parseLong(h, 16);
//            System.out.print(l);
        }
        System.out.println();

        planText = rsa.decodeToString(encodedMessage);
        System.out.println(planText);
        System.out.println();
    }
}
