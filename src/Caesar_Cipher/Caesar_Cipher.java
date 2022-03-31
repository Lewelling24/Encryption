package Caesar_Cipher;

public class Caesar_Cipher {

    // store string to be encrypted
    private String text_to_encrypt;

    // store integer by which to shift
    private int shift_by;

    // getter for integer to shift by
    public int getShift_by() {
        return shift_by;
    }

    // getter for text to be encrypted
    public String getText_to_encrypt() {
        return text_to_encrypt;
    }

    // setter for integer to shift by
    public void setShift_by(int shift_by) {
        this.shift_by = shift_by;
    }

    // setter for text to be encrypted
    public void setText_to_encrypt(String text_to_encrypt) {
        this.text_to_encrypt = text_to_encrypt;
    }

    // method to apply a Caesar shift to a given string
    /*public String apply_Caesar(String text_to_encrypt, int shift_by) {

    }*/
}
