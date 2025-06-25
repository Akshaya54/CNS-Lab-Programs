## RSA

import java.math.*; import java.util.Scanner;
public class RSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter prime number: ");
        BigInteger p = sc.nextBigInteger();
        System.out.print("Enter another prime number: ");
        BigInteger q = sc.nextBigInteger();
        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        BigInteger e = new BigInteger("65537");
        BigInteger d = e.modInverse(phi);
        System.out.println("Encrypted keys are: (" + e + ", " + n + ")");
        System.out.println("Decrypted keys are: (" + d + ", " + n + ")");
    }
}

## output:
Enter prime number: 5
Enter another prime number: 9
Encrypted keys are: (65537, 45)
Decrypted keys are: (1, 45)
