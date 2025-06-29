## MD5

import java.security.MessageDigest;
public class SimpleMD5 {
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        System.out.println("Message Digest Object Info:");
        System.out.println("Algorithm = " + md.getAlgorithm());
        System.out.println("Provider = " + md.getProvider());
        System.out.println("toString = " + md.toString());
        String[] inputs = {"", "abc", "abcdefghijklmnopqrstuvwxyz"};
        for (String input : inputs) {
            md.update(input.getBytes());
            byte[] hash = md.digest();
            System.out.println("MD5(\"" + input + "\") = " + toHex(hash));
        }
    }
    static String toHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes)
            sb.append(String.format("%02x", b));
        return sb.toString();
    }
}

## output:
Message Digest Object Info:
Algorithm = MD5
Provider = SUN version 21
toString = MD5 Message Digest from SUN, <initialized>

MD5("") = d41d8cd98f00b204e9800998ecf8427e
MD5("abc") = 900150983cd24fb0d6963f7d28e17f72
MD5("abcdefghijklmnopqrstuvwxyz") = c3fcd3d76192e4007dfb496cca67e13b
