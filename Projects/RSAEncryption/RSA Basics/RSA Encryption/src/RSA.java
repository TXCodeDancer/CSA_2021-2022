
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

import java.nio.charset.StandardCharsets;

/**
 * The type Rsa.
 */
public class RSA
{
    private int n;
    private int e;
    private int d;
    final private int asciiSize = 128;
    /**
     * The Public key.
     */
    public PublicKey publicKey;

    /**
     * Instantiates a new Rsa.
     */
    RSA()
    {
        this.publicKey = new PublicKey();
        this.n = publicKey.getN();
        this.e = publicKey.getE();
        int phi_n = publicKey.getPhi_n();

        PrivateKey privateKey = new PrivateKey(n, phi_n, e);
        d = privateKey.getD();
    }

    /**
     * Instantiates a new Rsa.
     *
     * @param publicKey the public key
     */
    RSA(PublicKey publicKey)
    {
        this.publicKey = publicKey;
        this.n = this.publicKey.getN();
        this.e = this.publicKey.getE();
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

    /**
     * Instantiates a new Rsa.
     *
     * @param p the p
     * @param q the q
     */
    RSA(int p, int q)
    {
        this.publicKey = new PublicKey();
        this.n = publicKey.getN();
        this.e = publicKey.getE();
        int phi_n = publicKey.getPhi_n();

        PrivateKey privateKey = new PrivateKey(n, phi_n, e);
        d = privateKey.getD();
    }

    @Override
    public String toString()
    {
        return "RSA Public Key: <" +
                "n=" + publicKey.getN() +
                ", e=" + publicKey.getE() +
                '>';
    }

    private int[] encode(int[] M)
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
     * Encode string.
     *
     * @param plainText the plain text
     * @return the string
     */
    public String encode(String plainText)
    {
        byte[] M = plainText.getBytes(StandardCharsets.US_ASCII);
        int[] C = new int[M.length];
        for (int i = 0; i < M.length; i++)
        {
            int m = M[i];
            int c = Maths.powerMod(m, e, n);
            C[i] = c;
        }
        return IntArrayToHexString(C);
    }

    /**
     * Encode hard string.
     *
     * @param plainText the plain text
     * @return the string
     */
    public String encodeHard(String plainText)
    {
        byte[] M = plainText.getBytes(StandardCharsets.US_ASCII);
        int cLength = M.length/2;
        if(M.length % 2 != 0)
        {
            cLength++;
        }
        int[] C = new int[cLength];
        for (int i = 0, j = 0; i <= M.length - 1; i += 2, j++ )
        {
            int m = M[i] * asciiSize;
            if(i <= M.length - 2)
            {
                m += M[i+1];
            }

            int c = Maths.powerMod(m, e, n);
            C[j] = c;
        }
        return IntArrayToHexString(C);
    }

    private int[] decodeToInt(int[] cipherText)
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

    private String decode(int[] cipherText)
    {
        int[] D = decodeToInt(cipherText);
        char[] M = new char[cipherText.length];
        for(int i = 0; i < D.length; i++)
        {
            M[i] = (char)D[i];
        }
        return new String(M);
    }

    private String decodeHard(int[] cipherText)
    {
        int[] D = new int[cipherText.length * 2];
        for (int i = 0, j = 0; i < cipherText.length; i++, j+=2)
        {
            D[j] = cipherText[i] / asciiSize;
            D[j + 1] = cipherText[i] % asciiSize;
        }

        int mLength = D.length;
        if(D[D.length - 1] == 0)
        {
            mLength--;
        }
        char[] M = new char[mLength];
        for(int i = 0; i < mLength; i++)
        {
            M[i] = (char)D[i];
        }
        return new String(M);
    }

    /**
     * Decode string.
     *
     * @param cipherText the cipher text
     * @return the string
     */
    public String decode(String cipherText)
    {
        String str = decode(hexStringToIntArray(cipherText));
        return str;
    }

    /**
     * Decode hard string.
     *
     * @param cipherText the cipher text
     * @return the string
     */
    public String decodeHard(String cipherText)
    {
        int[] intArray = hexStringToIntArray(cipherText);
        int[] D = decodeToInt(intArray);
        String str = decodeHard(D);
        return str;
    }

    private int[] hexStringToIntArray(String cipherText)
    {
        final int hexSize = 4;
        int arrayLength = cipherText.length()/hexSize;
        int[] array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++)
        {
            String str = cipherText.substring(0, hexSize);
            cipherText = cipherText.substring(hexSize);
            array[i] = Integer.parseInt(str, 16);
        }
        return array;
    }

    private String IntArrayToHexString(int[] cipherText)
    {
        String output = "";
        for(int e : cipherText)
        {
            output += String.format("%04X", e);
        }
        return output;
    }
}
