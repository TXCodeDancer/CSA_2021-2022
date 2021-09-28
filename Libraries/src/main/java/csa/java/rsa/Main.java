package csa.java.rsa;
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        RSA rsa = new RSA();
        int[] message = {0,1,2,3,4,5,6,7,8,9, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 210, 220, 221, 222, 223, 224, 225};
        for(int m : message)
        {
            System.out.print(m + ", ");
        }
        System.out.println();

        int[] encodedMessage = rsa.encode(message);

        for(int e : encodedMessage)
        {
            System.out.print(String.format("%02X", e) + ", ");
            String h = Integer.toHexString(e);
            int l = Integer.parseInt(h, 16);
//            System.out.print(l);

        }
        System.out.println();

        int[] decodedMessage = rsa.decode(encodedMessage);
        for(int d : decodedMessage)
        {
            System.out.print(d + ", ");
        }
        System.out.println();

        ///////////////////////////////////
        System.out.println();
        String plainText = "This is a test!";
        System.out.println(plainText);

        encodedMessage = rsa.encode(plainText);

        for(int e : encodedMessage)
        {
            System.out.print(String.format("%02X", e));
            String h = Integer.toHexString(e);
            int l = Integer.parseInt(h, 16);
//            System.out.print(l);
        }
        System.out.println();

        plainText = rsa.decodeToString(encodedMessage);
        System.out.println(plainText);
        System.out.println();

        ///////////////////////////////////
        System.out.println();
        List<Character> characters = new ArrayList<Character>();
        for(char ch = 0; ch < 128; ch++)
        {
            characters.add(ch);
        }

        char[] chars = new char[characters.size()];
        for(int i = 0; i < chars.length; i++)
        {
            chars[i] = characters.get(i);
        }

        plainText = new String(chars);
        System.out.println(plainText);

        encodedMessage = rsa.encode(plainText);

        for(int e : encodedMessage)
        {
            System.out.print(String.format("%02X", e));
            String h = Integer.toHexString(e);
            int l = Integer.parseInt(h, 16);
//            System.out.print(l);
        }
        System.out.println();

        plainText = rsa.decodeToString(encodedMessage);
        System.out.println(plainText);
        System.out.println();
    }
}
