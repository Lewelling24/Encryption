package Driver;


import Caesar_Cipher.Caesar_Cipher;

public class Driver {

    public static void main(String [] args) {
        //System.out.println("Hello World");

        // store encrypted version of hello
        String hello = Caesar_Cipher.apply_Caesar("Hello", 5);

        // print encrypted hello to the console
        System.out.println(hello);

        // store decrypted hello
        String hello_again = Caesar_Cipher.undo_Caesar(hello, 5);

        // print decrypted hello to the console
        System.out.println(hello_again);



    }

}
