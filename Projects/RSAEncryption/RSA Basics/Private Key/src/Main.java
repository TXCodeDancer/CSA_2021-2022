
/*
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 10/16/2021
 */

public class Main
{
    public static void main(String[] args)
    {
        System.out.println();
        PublicKey publicKey = new PublicKey();
        System.out.println("Public key <" + publicKey.getN() + ", " + publicKey.getE() + ">");

        PrivateKey privateKey = new PrivateKey(publicKey.getN(), publicKey.getPhi_n(), publicKey.getE());
        System.out.println("Private key <" + privateKey.getN() + ", " + privateKey.getD() + ">");
        System.out.println();
    }
}
