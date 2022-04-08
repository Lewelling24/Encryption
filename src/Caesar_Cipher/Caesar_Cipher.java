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
    public static String apply_Caesar(String text_to_encrypt, int shift_by) {

        String lower_case_text_to_encrypt = text_to_encrypt.toLowerCase();

        // use string builder to form string for return
        StringBuilder encrypted_text = new StringBuilder();

        // convert to character array for manipulation
        char  [] c_array = lower_case_text_to_encrypt.toCharArray();

        // for loop to iterate through character array
        for (char c : c_array) {


            // check if character is a space
            if (c != ' ') {

                // check case for
                int start_position = c - 'a'; // subtract 'a' to account for ascii values >= 29
                int end_position = (start_position + shift_by) % 26; // mod 26 to account for values >= 26

                // type cast integer into character
                char new_character = (char) ('a' + end_position); // add 'a' back for ascii values

                encrypted_text.append(new_character);
            } else {
                // if character is a space append it to encrypted_text string
                encrypted_text.append(c);
            }
        }

        // convert string builder to string for return
        return encrypted_text.toString();
    }

    public static String undo_Caesar(String text_to_decrypt, int shift_by) {

        // calculate new character value
        int shift_to = 26 - (shift_by % 26);

        StringBuilder decrypted_text = new StringBuilder();

        char [] c_array = text_to_decrypt.toCharArray();

        for (char c : c_array) {
            if (c != ' ') {
                int start_position = c - 'a'; // subtract 'a' to account for ascii values >= 29
                int end_position = (start_position + shift_to) % 26; // mod 26 to account for values >= 26

                // type cast integer into character
                char new_character = (char) ('a' + end_position); // add 'a' back for ascii values

                decrypted_text.append(new_character);
            } else {
                decrypted_text.append(c);
            }
        }

        // convert string builder to string for return
        return decrypted_text.toString();
    }
}
