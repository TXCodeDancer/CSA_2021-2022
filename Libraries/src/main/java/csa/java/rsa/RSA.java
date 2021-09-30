package csa.java.rsa;
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

import java.nio.charset.StandardCharsets;

public class RSA
{
    private int n;
    private int e;
    private int d;
    final private int asciiSize = 128;

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

    RSA(int p, int q)
    {
        PublicKey publicKey = new PublicKey(p, q);
        this.n = publicKey.getN();
        this.e = publicKey.getE();
        int phi_n = publicKey.getPhi_n();

        PrivateKey privateKey = new PrivateKey(n, phi_n, e);
        d = privateKey.getD();
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
        int[] splitCipherText = new int[cipherText.length * 2];
        for (int i = 0, j = 0; i < cipherText.length; i++, j+=2)
        {
            splitCipherText[j] = cipherText[i] / asciiSize;
            splitCipherText[j + 1] = cipherText[i] % asciiSize;
        }

        int[] D = decodeToInt(splitCipherText);
        char[] M = new char[D.length];
        for(int i = 0; i < D.length; i++)
        {
            M[i] = (char)D[i];
        }
        return new String(M);
    }

    public String decode(String cipherText)
    {
        String str = decode(hexStringToIntArray(cipherText));
        return str;
    }

    public String decodeHard(String cipherText)
    {
        int[] intArray = hexStringToIntArray(cipherText);
        String str = decode(intArray);
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

//    private int[] hexStringPairToIntArray(String cipherText)
//    {
//        final int hexSize = 4;
//        int arrayLength = (cipherText.length() * 2)/hexSize;
//        int[] array = new int[arrayLength];
//        for(int i = 0; i < arrayLength; i += 2)
//        {
//            String str = cipherText.substring(0, hexSize);
//            cipherText = cipherText.substring(hexSize);
//            int pair = Integer.parseInt(str, 16);
//            array[i] = pair/asciiSize;
//            array[i + 1] = pair % asciiSize;
//        }
//        return array;
//    }

    private String IntArrayToHexString(int[] cipherText)
    {
        String output = "";
        for(int e : cipherText)
        {
            output += String.format("%04X", e);
        }
        return output;
    }

//    private String IntArrayPairToHexString(int[] cipherText)
//    {
//        String output = "";
//        for(int j = 0, i = cipherText.length - 1; i >= 0; j++, i -= 2)
//        {
//            int pair = cipherText[j] * asciiSize;
//            if(i > 0)
//            {
//                pair += cipherText[j + 1];
//            }
//            output += String.format("%08X", pair);
//        }
//        return output;
//    }
}
