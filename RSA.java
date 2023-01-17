import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {
    private final static BigInteger one = new BigInteger("1");
    private BigInteger privateKey;
    private BigInteger publicKey;
    private BigInteger modulus;

    // Generate an N-bit (roughly) public and private key
    RSA(int N) {
        SecureRandom r = new SecureRandom();
        BigInteger p = new BigInteger(N / 2, 100, r);
        BigInteger q = new BigInteger(N / 2, 100, r);
        modulus = p.multiply(q);
        BigInteger m = (p.subtract(one)).multiply(q.subtract(one));
        publicKey = new BigInteger("65537"); // common value in practice = 2^16 + 1
        privateKey = publicKey.modInverse(m);
    }

    BigInteger encrypt(BigInteger message) {
        return message.modPow(publicKey, modulus);
    }

    BigInteger decrypt(BigInteger encrypted) {
        return encrypted.modPow(privateKey, modulus);
    }

    public String toString() {
        String s = "";
        s += "public  = " + publicKey + "\n";
        s += "private = " + privateKey + "\n";
        s += "modulus = " + modulus;
        return s;
    }

    public static void main(String[] args) {
        RSA key = new RSA(Integer.parseInt(args[0]));
        System.out.println(key);

        // create message by converting string to integer
        String message = "Hello World";
        BigInteger plaintext = new BigInteger(message.getBytes());
        System.out.println("Plaintext: " + message);

        // encrypt the message
        BigInteger ciphertext = key.encrypt(plaintext);
        System.out.println("Ciphertext: " + ciphertext);

        // decrypt the message
        plaintext = key.decrypt(ciphertext);
        String decrypted = new String(plaintext.toByteArray());
        System.out.println("Decrypted: " + decrypted);
    }
}
