## Substitution Cipher

import java.util.Scanner;
public class Substitution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zyxwvutsrqponmlkjihgfedcba";  // Substitution map (reversed
        System.out.print("Enter any string: ");
        String str = sc.nextLine().toLowerCase();
        String decrypt = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int j = a.indexOf(c);
            if (j != -1) {
                decrypt += b.charAt(j); // Substitute using mapping
            } else {
                decrypt += c; // Keep space/symbols as is
            }
        }
        System.out.println("The encrypted data is: " + decrypt);
    }
}


## output:
Enter any string: aceho
The encrypted data is: zxvsl
