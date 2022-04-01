package Driver;


import Caesar_Cipher.Caesar_Cipher;

public class Driver {

    public static void main(String [] args) {
        //System.out.println("Hello World");

        Caesar_Cipher cc = new Caesar_Cipher();

        System.out.println(cc.apply_Caesar("i have a balloon", 14));

    }

}
