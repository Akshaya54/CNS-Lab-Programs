## SHA1

import java.security.*;
public class SHA1 {
    public static void main(String[] args) throws Exception {
        String[] inputs = {"", "abc", "abcdefghijklmnopqrstuvwxyz"};
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        System.out.println("Message Digest Info:");
        System.out.println("Algorithm: " + md.getAlgorithm());
        System.out.println("Provider: " + md.getProvider());
        for (String input : inputs) {
            md.update(input.getBytes());
            byte[] output = md.digest();
            System.out.println("SHA1(\"" + input + "\") = " + bytesToHex(output));
        }
    }
    public static String bytesToHex(byte[] b) {
        StringBuilder sb = new StringBuilder();
        for (byte val : b) {
            sb.append(String.format("%02x", val));
        }
        return sb.toString();
    }
}

## output:
Message Digest Info:
Algorithm: SHA-1
Provider: SUN version 21
SHA1("") = da39a3ee5e6b4b0d3255bfef95601890afd80709
SHA1("abc") = a9993e364706816aba3e25717850c26c9cd0d89d
SHA1("abcdefghijklmnopqrstuvwxyz") = 32d10c7b8cf96570ca04ce37f2a19d84240d3a89
