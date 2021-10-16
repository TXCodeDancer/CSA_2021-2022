
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

public class Main
{
    public static void main(String[] args)
    {
        System.out.println();
        PublicKey key = new PublicKey();
        System.out.println("Public key <" + key.getN() + ", " + key.getE() + ">");

        PublicKey key1 = new PublicKey(key);
        System.out.println("Public key <" + key1.getN() + ", " + key1.getE() + ">");

        PublicKey key2 = new PublicKey(11, 13);
        System.out.println("Public key <" + key2.getN() + ", " + key2.getE() + ">");

        System.out.println();
    }
}
