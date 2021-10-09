
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

/**
 * The type Private key.
 */
public class PrivateKey
{
    private int n;
    private int d;

    /**
     * Instantiates a new Private key.
     *
     * @param n     the n
     * @param phi_n the phi n
     * @param e     the e
     */
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

    /**
     * Gets n.
     *
     * @return the n
     */
    public int getN()
    {
        return n;
    }

    /**
     * Gets d.
     *
     * @return the d
     */
    public int getD()
    {
        return d;
    }
}
