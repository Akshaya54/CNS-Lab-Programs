## RC4 program

import javax.crypto.*;
import java.util.Base64;
public class RC4 {
    public static void main(String[] args) throws Exception {
        String input = "HelloWorld";
        KeyGenerator kg = KeyGenerator.getInstance("Blowfish");
        SecretKey key = kg.generateKey();
        Cipher c = Cipher.getInstance("Blowfish");
        c.init(Cipher.ENCRYPT_MODE, key);
        String enc = Base64.getEncoder().encodeToString(c.doFinal(input.getBytes()));
        c.init(Cipher.DECRYPT_MODE, key);
        String dec = new String(c.doFinal(Base64.getDecoder().decode(enc)));
        System.out.println("Original: " + input);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}

## output:
Original: HelloWorld
Encrypted: BcIp4+D8GdgQUe0aY/XENg==
Decrypted: HelloWorld
