
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
        RSA rsaBob = new RSA();
        System.out.println("Bob's " + rsaBob);
        RSA rsaAlice = new RSA();
        System.out.println("Alice's " + rsaAlice);

        ////////////////////// Alice's question to Bob //////////////////////
        System.out.println();
        System.out.println("Alice's question to Bob:");
        String AliceMessageToBob = "Bob, what's the plan?";
        System.out.println(AliceMessageToBob);

        PublicKey bobPublicKey =rsaBob.publicKey;
        RSA aliceToBob = new RSA(bobPublicKey);
        String ciphertextToBob = aliceToBob.encode(AliceMessageToBob);
        System.out.println(ciphertextToBob);

        String plaintextFromAlice = rsaBob.decode(ciphertextToBob);
        System.out.println(plaintextFromAlice);

        ////////////////////// Bob's reply to Alice /////////////////////////
        System.out.println();
        System.out.println("Bob's reply to Alice:");
        String BobMessageToAlice = "Alice, attack at 7am.";
        System.out.println(BobMessageToAlice);

        PublicKey alicePublicKey = rsaAlice.publicKey;
        RSA bobToAlice = new RSA(alicePublicKey);
        String ciphertextToAlice = bobToAlice.encode(BobMessageToAlice);
        System.out.println(ciphertextToAlice);

        String plaintextFromBob = rsaAlice.decode(ciphertextToAlice);
        System.out.println(plaintextFromBob);
    }
}
