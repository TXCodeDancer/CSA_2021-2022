import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PrivateKeyTests {
  @Test
  public void test() {
    PublicKey publicKey = new PublicKey();
    int n = publicKey.getN();
    int e = publicKey.getE();
    int phi_n = publicKey.getPhi_n();

    PrivateKey privateKey = new PrivateKey(n, phi_n, e);
    int d = privateKey.getD();
    int k = (d * e - 1)/phi_n;


    assertTrue(!Maths.isPrime(n));
    assertTrue((k * phi_n + 1) % e == 0);
  }
}