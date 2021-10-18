
/*
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/28/2021
 */


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

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

        int size = '~' - ' ' + 1;
        char[] printableAscii = new char[size];
        for(char ch = ' ', i = 0; ch <= '~'; ch++, i++)
        {
            printableAscii[i] = ch;
        }

        String plainText = new String(printableAscii);
        String actual = rsa.encode(plainText);

        String expected = "0080004300BB007800D400D60040005B00830014005700310063008D001C00AE00D3002B005400330034009000A300D9001700D800250002005300850038002D0026008F00C4002100CC00CD000800B400840039001D00AD001300A8004100D100D700BF004B003C003200770012002A005F0095008E00B6006900BD006400DA0049000B006A006D005E00BA0088006700C3001B0062004A007200BE00CE000F001F006B0093007B00C2001A007600550023007F0070007300D200940003";
        assertTrue(expected.equals(actual));


        String cipherText = actual;
        actual = rsa.decode(cipherText);
        expected = plainText;

        assertTrue(expected.equals(actual));
    }
}

