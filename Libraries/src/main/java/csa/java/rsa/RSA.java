package csa.java.rsa;
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class RSA
{
    private int n;
    private int e;
    private int d;

    RSA()
    {
        PublicKey publicKey = new PublicKey();
//        this.n = publicKey.getN();
//        this.e = publicKey.getE();
//        int phi_n = publicKey.getPhi_n();
        this.n = 39;
        this.e = 3;
//        int phi_n = 20;
//
//        PrivateKey privateKey = new PrivateKey(n, phi_n, e);
//        d = privateKey.getD();
        d = 7;
    }

    public long[] encode(String plainText)
    {
        long a = Character.getNumericValue('a');
        char[] M = plainText.toCharArray();
        long[] C = new long[M.length];
        for (int i = 0; i < M.length; i++)
        {
            long m = Character.getNumericValue(M[i]) - a;
            long c = ((long)Math.pow(m, e) % n);
            C[i] = c;
        }
        return C;
    }

    public String decode(long[] cipherText)
    {
        int a = (int)'a';
        char[] M = new char[cipherText.length];
        for (int i = 0; i < cipherText.length; i++)
        {
            long c = cipherText[i];
            int m = (int)Math.pow(c, d) % n;
            char ch = (char)(m + a);
            M[i] = ch;
        }

        return new String(M);
    }

    private static int modPower(int x, int y, int p)
    {
        int result = 1; // Initialize result

        x = x % p; // Update x if it is more than or
        // equal to p

        if (x == 0)
            return 0; // In case x is divisible by p;

        while (y > 0)
        {

            // If y is odd, multiply x with result
            if ((y & 1) != 0)
                result = (result * x) % p;

            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return result;
    }

}
