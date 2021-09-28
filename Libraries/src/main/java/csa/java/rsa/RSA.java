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

    RSA(int n, int e, int d)
    {
        this.n = n;
        this.e = e;
        this.d = d;
    }

    @Override
    public String toString()
    {
        return "RSA{" +
                "n=" + n +
                ", e=" + e +
                ", d=" + d +
                '}';
    }

    public int[] encode(int[] M)
    {
        int[] C = new int[M.length];
        for (int i = 0; i < M.length; i++)
        {
            int m = M[i];
            int c = modPower(m, e, n);
            C[i] = c;
        }
        return C;
    }

    public int[] encode(String plainText)
    {
        byte[] M = plainText.getBytes(StandardCharsets.US_ASCII);
        int[] C = new int[M.length];
        for (int i = 0; i < M.length; i++)
        {
            int m = M[i];
            int c = modPower(m, e, n);
            C[i] = c;
        }
        return C;
    }

    public int[] decode(int[] cipherText)
    {
        int[] M = new int[cipherText.length];
        for (int i = 0; i < cipherText.length; i++)
        {
            int c = cipherText[i];
            int m = modPower(c, d, n);
            M[i] = m;
        }
        return M;
    }

    public String decodeToString(int[] cipherText)
    {
        int[] D = decode(cipherText);
        char[] M = new char[cipherText.length];
        for(int i = 0; i < D.length; i++)
        {
            M[i] = (char)D[i];
        }

        return new String(M);
    }

    private static int modPower(int x, int y, int p)
    {
        // https://www.geeksforgeeks.org/modular-exponentiation-power-in-modular-arithmetic/
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
