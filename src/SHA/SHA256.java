package SHA;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



// class for implementing SHA-256 on a given string
public class SHA256 {

    public static byte[] return_sha(String text) throws NoSuchAlgorithmException {


        // call MessageDigest.getInstance specifying SHA-256 as the algorithm
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        // call digest() to calculate the message digest for the in put and return it as a byte array
        return digest.digest(text.getBytes(StandardCharsets.UTF_8));


    }

    public String getHex(byte[] hash) {

        // convert byte array into signum
        BigInteger bignum = new BigInteger(1, hash);

        // convert in hex representation
        StringBuilder hex_rep = new StringBuilder(bignum.toString(16));

        // Pad with leading zeros
        while (hex_rep.length() < 32) {
            hex_rep.insert(0, '0');
        }

        return hex_rep.toString();
    }


}
