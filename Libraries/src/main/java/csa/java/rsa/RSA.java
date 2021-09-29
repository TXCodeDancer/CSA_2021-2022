package csa.java.rsa;
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

/**
 * The type Rsa.
 */
public class RSA
{
    private int n;
    private int e;
    private int d;

    /**
     * Instantiates a new Rsa.
     */
    RSA()
    {
        PublicKey publicKey = new PublicKey();
        this.n = publicKey.getN();
        this.e = publicKey.getE();
        int phi_n = publicKey.getPhi_n();

        PrivateKey privateKey = new PrivateKey(n, phi_n, e);
        d = privateKey.getD();
    }

    /**
     * Instantiates a new Rsa.
     *
     * @param n the n
     * @param e the e
     * @param d the d
     */
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

    /**
     * Encode int [ ].
     *
     * @param M the m
     * @return the int [ ]
     */
    public int[] encode(int[] M)
    {
        int[] C = new int[M.length];
        for (int i = 0; i < M.length; i++)
        {
            int m = M[i];
            int c = Maths.powerMod(m, e, n);
            C[i] = c;
        }
        return C;
    }

    /**
     * Encode int [ ].
     *
     * @param plainText the plain text
     * @return the int [ ]
     */
    public int[] encode(String plainText)
    {
        byte[] M = plainText.getBytes(StandardCharsets.US_ASCII);
        int[] C = new int[M.length];
        for (int i = 0; i < M.length; i++)
        {
            int m = M[i];
            int c = Maths.powerMod(m, e, n);
            C[i] = c;
        }
        return C;
    }

    /**
     * Decode int [ ].
     *
     * @param cipherText the cipher text
     * @return the int [ ]
     */
    public int[] decode(int[] cipherText)
    {
        int[] M = new int[cipherText.length];
        for (int i = 0; i < cipherText.length; i++)
        {
            int c = cipherText[i];
            int m = Maths.powerMod(c, d, n);
            M[i] = m;
        }
        return M;
    }

    /**
     * Decode to string string.
     *
     * @param cipherText the cipher text
     * @return the string
     */
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


}
