package csa.java.rsa;
/*
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/28/2021
 */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class RSATests
{

    @Test
    public void testTextEncode()
    {
        RSA rsa = new RSA(221, 35, 11);
        String plainText = "This is a test!";
        String actual = rsa.encode(plainText);
        String expected = "003200C3001B007B0080001B007B0080000B008000C200BA007B00C20043";

        assertTrue(expected.equals(actual));
    }

    @Test
    public void testTextDecode()
    {
        RSA rsa = new RSA(221, 35, 11);
        String cipherText = "003200C3001B007B0080001B007B0080000B008000C200BA007B00C20043";
        String actual = rsa.decode(cipherText);
        String expected = "This is a test!";

        assertTrue(expected.equals(actual));
    }

    @Test
    public void testPrintableAsciiEncodeDecode()
    {
        RSA rsa = new RSA(221, 35, 11);
        List<Character> characters = new ArrayList<Character>();
        for(char ch = 32; ch < 127; ch++)
        {
            characters.add(ch);
        }
        char[] chars = new char[characters.size()];
        for(int i = 0; i < chars.length; i++)
        {
            chars[i] = characters.get(i);
        }
        String plainText = new String(chars);
        String actual = rsa.encode(plainText);

        String expected = "0080004300BB007800D400D60040005B00830014005700310063008D001C00AE00D3002B005400330034009000A300D9001700D800250002005300850038002D0026008F00C4002100CC00CD000800B400840039001D00AD001300A8004100D100D700BF004B003C003200770012002A005F0095008E00B6006900BD006400DA0049000B006A006D005E00BA0088006700C3001B0062004A007200BE00CE000F001F006B0093007B00C2001A007600550023007F0070007300D200940003";

        assertTrue(expected.equals(actual));


        String cipherText = actual;
        actual = rsa.decode(cipherText);
        expected = plainText;

        assertTrue(expected.equals(actual));
    }

    @Test
    public void testTextEncodeHard()
    {
        RSA rsa = new RSA(127, 131);
        String plainText = "This is a test!";
        String actual = rsa.encodeHard(plainText);
        String expected = "38DA0FBD0758269F0DF4303B1D1A3BA3";

        assertTrue(expected.equals(actual));
    }

    @Test
    public void testTextDecodeHard()
    {
        RSA rsa = new RSA(127, 131);
        String cipherText = "38DA0FBD0758269F0DF4303B1D1A3BA3";
        String actual = rsa.decodeHard(cipherText);
        String expected = "This is a test!";

        assertTrue(expected.equals(actual));
    }

    @Test
    public void testPrintableAsciiEncodeDecodeHard()
    {
        RSA rsa = new RSA(127, 131);
        List<Character> characters = new ArrayList<Character>();
        for(char ch = 32; ch < 127; ch++)
        {
            characters.add(ch);
        }
        char[] chars = new char[characters.size()];
        for(int i = 0; i < chars.length; i++)
        {
            chars[i] = characters.get(i);
        }
        String plainText = new String(chars);

        String cipherText = rsa.encodeHard(plainText);
        String actual = cipherText;
        String expected = "38FC1F3526120546355F40853753290A170C229031352B4037C12FB92BCA016D293D1C25065A2700065C21A404A121820715109C20383ABF285E0596371D17623DB7332E3E3F037F2D43097B0D813579167210643D3D38F31B762D5E053F1C46";
        assertTrue(expected.equals(actual));

        actual = rsa.decodeHard(cipherText);
        expected = plainText;
        assertTrue(expected.equals(actual));
    }
}

