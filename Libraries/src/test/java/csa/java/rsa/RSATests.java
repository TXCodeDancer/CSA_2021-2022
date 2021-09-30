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
        RSA rsa = new RSA(127, 131);
        String plainText = "This is a test!";
        String actual = rsa.encode(plainText);
        String expected = "38DA0FBD0758269F0DF4303B1D1A3BA3";

        assertTrue(expected.equals(actual));
    }

    @Test
    public void testTextDecode()
    {
        RSA rsa = new RSA(127, 131);
        String cipherText = "38DA0FBD0758269F0DF4303B1D1A3BA3";
        String actual = rsa.decode(cipherText);
        String expected = "This is a test!";

        assertTrue(expected.equals(actual));
    }
}

