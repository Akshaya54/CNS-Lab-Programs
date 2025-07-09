# Caeser Cipher

import java.util.Scanner;
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        String encrypted = "";
        for (int i = 0; i < str.length(); i++) {
            encrypted += (char)(str.charAt(i) + key);
        }
        System.out.println("\nEncrypted string is: " + encrypted);
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            decrypted += (char)(encrypted.charAt(i) - key);
        }
        System.out.println("Decrypted string is: " + decrypted);
    }
}

## output:

Enter any string: hello world
Enter the key: 5

Encrypted string is: mjqqt%|twqi
Decrypted string is: hello world
