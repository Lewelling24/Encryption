package SHA;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



// class to implement SHA-512
public class SHA512 {

    public static String getSHA512(String text) throws NoSuchAlgorithmException {

        // call getInstance and specify SHA-512 as the algorithm
        MessageDigest digest = MessageDigest.getInstance("SHA-512");

        // call digest method to calculate message digest of given string and store it as a byte array
        byte[] mDigest = digest.digest(text.getBytes());

        // convert to signum rep
        BigInteger BigInt = new BigInteger(1,mDigest);

        //convert signum to hex representation
        String hexRep = BigInt.toString(16);

        // append leading 0's
        while(hexRep.length() < 32) {
            hexRep = "0" + hexRep;
        }

        return hexRep;
    }
}
