package csa.java.rsa;
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

public class PrivateKey
{
    private int n;
    private int d;

    public PrivateKey(int n, int phi_n, int e)
    {
        this.n = n;

        // Find lowest k where (k * φ(n) + 1) mod e ≡ 0
        int k = Integer.MIN_VALUE;
        for(int i = 0; i < phi_n; i++)
        {
            if((i * phi_n + 1) % e == 0)
            {
                k = i;
                break;
            }
        }

        // Compute d;
        d = (k * phi_n + 1)/e;
    }

    public int getN()
    {
        return n;
    }

    public int getD()
    {
        return d;
    }
}
