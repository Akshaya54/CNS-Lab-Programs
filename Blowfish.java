## BLOWFISH

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
public class BlowfishSimple {
    public static void main(String[] args) throws Exception {
        String data = "abcdef";
        String key = "12345";
        Cipher cipher = Cipher.getInstance("Blowfish");
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        String encrypted = Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes()));
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        String decrypted = new String(cipher.doFinal(Base64.getDecoder().decode(encrypted)));
        System.out.println("Original : " + data);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}

## output :
Original : abcdef
Encrypted: EmROl0iDj24=
Decrypted: abcdef
