package Caesar_Cipher;

import static org.junit.jupiter.api.Assertions.*;

class Caesar_CipherTest {

    @org.junit.jupiter.api.Test
    void apply_Caesar() {

        assertEquals("l kdyh d edoorrq", Caesar_Cipher.apply_Caesar("i have a balloon", 3));
    }

    @org.junit.jupiter.api.Test
    void undo_Caesar() {

        assertEquals("i have a balloon", Caesar_Cipher.undo_Caesar("l kdyh d edoorrq", 3));
    }
}