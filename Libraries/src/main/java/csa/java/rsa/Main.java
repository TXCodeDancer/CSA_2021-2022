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
//        RSA rsa = new RSA(221, 35, 11);
//        RSA rsa = new RSA(89, 97);
        RSA rsa = new RSA();
        System.out.println(rsa);

        System.out.println();
        String plainText = "This is a test!";
        System.out.println(plainText);

        String encodedMessage = rsa.encode(plainText);
        System.out.println(encodedMessage);

        String decodedMessage = rsa.decode(encodedMessage);
        System.out.println(decodedMessage);
        System.out.println();

//        ///////////////////////////////////
//        System.out.println();
//        List<Character> characters = new ArrayList<Character>();
//        for(char ch = 0; ch < 128; ch++)
//        {
//            characters.add(ch);
//        }
//
//        char[] chars = new char[characters.size()];
//        for(int i = 0; i < chars.length; i++)
//        {
//            chars[i] = characters.get(i);
//        }
//
//        plainText = new String(chars);
//        System.out.println(plainText);
//
//        encodedMessage = rsa.encode(plainText);
//
//        output = "";
//        for(int e : encodedMessage)
//        {
//            System.out.print(String.format("%02X", e));
//            output += String.format("%02X", e);
////            int l = Integer.parseInt(h, 16);
////            System.out.print(l);
//        }
//        System.out.println();
//        System.out.println(output);
//        System.out.println();
//
//        plainText = rsa.decodeToString(encodedMessage);
//        System.out.println(plainText);
//        System.out.println();
    }
}