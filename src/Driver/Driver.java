package Driver;


import Caesar_Cipher.Caesar_Cipher;

public class Driver {

    public static void main(String [] args) {
        //System.out.println("Hello World");

        Caesar_Cipher cc = new Caesar_Cipher();

        String test_encrypt = cc.apply_Caesar("i have a balloon", 14);
        System.out.println(test_encrypt);



        String test_decrypt = cc.undo_Caesar(test_encrypt, 14);
        System.out.println(test_decrypt);

    }

}
