
/*
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/28/2021
 */


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PublicKeyTests
{
    @Test
    public void testDefaultConstructor()
    {
        PublicKey key = new PublicKey();
        int n = key.getN();
        int e = key.getE();

        assertTrue(!Maths.isPrime(n));
        assertTrue(Maths.isPrime(e));
    }

    @Test
    public void testPublicKeyConstructor()
    {
        PublicKey key = new PublicKey();
        int n = key.getN();
        int e = key.getE();

        PublicKey key_1 = new PublicKey();
        int n_1 = key.getN();
        int e_1 = key.getE();

        assertEquals(n, n_1);
        assertEquals(e, e_1);
    }

    @Test
    public void testPQConstructor()
    {
        int p = 19;
        int q = 43;
        PublicKey key = new PublicKey(19, 43);
        int n = key.getN();
        int e = key.getE();

        assertEquals(p * q, n);
        assertTrue(Maths.isPrime(e));
    }
}

