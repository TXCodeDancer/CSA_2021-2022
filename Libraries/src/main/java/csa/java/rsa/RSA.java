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
        this.n = 221;
        this.e = 35;
//        int phi_n = 20;
//
//        PrivateKey privateKey = new PrivateKey(n, phi_n, e);
//        d = privateKey.getD();
        d = 11;

        
    }

    public long[] encode(long[] M)
    {
        long[] C = new long[M.length];
        for (int i = 0; i < M.length; i++)
        {
            long m = M[i];
            long c = modPower(m, e, n);
            C[i] = c;
        }
        return C;
    }

    public long[] encode(String plainText)
    {
        byte[] M = plainText.getBytes(StandardCharsets.US_ASCII);
        long[] C = new long[M.length];
        for (int i = 0; i < M.length; i++)
        {
            long m = M[i];
            long c = modPower(m, e, n);
            C[i] = c;
        }
        return C;
    }

    public long[] decode(long[] cipherText)
    {
        long[] M = new long[cipherText.length];
        for (int i = 0; i < cipherText.length; i++)
        {
            long c = cipherText[i];
            long m = modPower(c, d, n);
            M[i] = m;
        }
        return M;
    }

    public String decodeToString(long[] cipherText)
    {
        long[] D = decode(cipherText);
        char[] M = new char[cipherText.length];
        for(int i = 0; i < D.length; i++)
        {
            M[i] = (char)D[i];
        }

        return new String(M);
    }

    private static long modPower(long x, long y, long p)
    {
        // https://www.geeksforgeeks.org/modular-exponentiation-power-in-modular-arithmetic/
        long result = 1; // Initialize result

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
