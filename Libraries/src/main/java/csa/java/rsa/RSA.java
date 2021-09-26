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
        this.n = publicKey.getN();
        this.e = publicKey.getE();
        int phi_n = publicKey.getPhi_n();

        PrivateKey privateKey = new PrivateKey(n, phi_n, e);
        d = privateKey.getD();
    }

    public int[] encode(String plainText)
    {
        byte[] M = plainText.getBytes(StandardCharsets.UTF_8);
        int[] C = new int[M.length];
        for (int i = 0; i < M.length; i++)
        {
            int m = M[i];
            int c = modPower(m, e, n);
            C[i] = c;
        }
        return C;
    }

    public String decode(int[] cipherText)
    {
        byte[] M = new byte[cipherText.length];
        for (int i = 0; i < cipherText.length; i++)
        {
            int c = cipherText[i];
            int m = modPower(c, d, n);
            M[i] = (byte)m;
        }

        String plainText = new String(M, StandardCharsets.UTF_8);
        return plainText;
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
