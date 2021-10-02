package csa.java.rsa;
/*
 ** @project RSA
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 9/26/2021
 */

public class Main
{
    public static void main(String[] args)
    {
        ////////////////////// Alice's question to Bob //////////////////////
        System.out.println();
        System.out.println("Alice's question to Bob:");
        RSA rsaBob = new RSA();
        System.out.println("Bob:" + rsaBob);

        String AliceMessageToBob = "Bob, what's the plan?";
        System.out.println(AliceMessageToBob);

        PublicKey bobPublicKey = new PublicKey();
        bobPublicKey.setN(rsaBob.getN());
        bobPublicKey.setE(rsaBob.getE());
        RSA aliceToBob = new RSA(bobPublicKey);
        String ciphertextToBob = aliceToBob.encode(AliceMessageToBob);
        System.out.println(ciphertextToBob);

        String plaintextFromAlice = rsaBob.decode(ciphertextToBob);
        System.out.println(plaintextFromAlice);

        ////////////////////// Bob's reply to Alice /////////////////////////
        System.out.println();
        System.out.println("Bob's reply to Alice:");
        RSA rsaAlice = new RSA();
        System.out.println("Alice: " + rsaAlice);
        String BobMessageToAlice = "Alice, attack at 7am.";
        System.out.println(BobMessageToAlice);

        PublicKey alicePublicKey = new PublicKey();
        alicePublicKey.setN(rsaAlice.getN());
        alicePublicKey.setE(rsaAlice.getE());
        RSA bobToAlice = new RSA(alicePublicKey);
        String ciphertextToAlice = bobToAlice.encode(BobMessageToAlice);
        System.out.println(ciphertextToAlice);

        String plaintextFromBob = rsaAlice.decode(ciphertextToAlice);
        System.out.println(plaintextFromBob);
    }
}
