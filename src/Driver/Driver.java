package Driver;


import Caesar_Cipher.Caesar_Cipher;
import SHA.SHA256;

import java.security.NoSuchAlgorithmException;

public class Driver {

    public static void main(String [] args) {
        //System.out.println("Hello World");


        // Driver for Caesar_Cipher
        /*// store encrypted version of hello
        String hello = Caesar_Cipher.apply_Caesar("Hello", 5);

        // print encrypted hello to the console
        System.out.println(hello);

        // store decrypted hello
        String hello_again = Caesar_Cipher.undo_Caesar(hello, 5);

        // print decrypted hello to the console
        System.out.println(hello_again); */


        // Driver for SHA-256 class
        try {
            SHA256 sha256 = new SHA256();

            System.out.println("\nHashCode generated using SHA-256 for:");

            String hash_test = "IHaLBoC";

            System.out.println("\n"+hash_test);

            System.out.println("\n" + sha256.getHex(SHA256.return_sha(hash_test)));
        }
        catch (NoSuchAlgorithmException N) {
            System.out.println("Error: No algorithm found");
        }


    }

}
