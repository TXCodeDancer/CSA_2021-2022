package csa.java.rsa;
/*
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/28/2021
 */

import org.testng.annotations.Test;

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
}

