package org.example;

import java.util.Scanner;

public class PizzaYummy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter plaintext
        System.out.print("Enter the plaintext: ");
        String plaintext = scanner.nextLine();

        // Encrypt the plaintext
        String encryptedText = rot13(plaintext);
        System.out.println("Encrypted text: " + encryptedText);

        // Decrypt the encrypted text
        String decryptedText = rot13(encryptedText);
        System.out.println("Decrypted text: " + decryptedText);

        scanner.close();
    }

    // Method to apply ROT13
    public static String rot13(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (((c - 'A' + 13) % 26) + 'A'));
            } else if (c >= 'a' && c <= 'z') { // Lowercase letters
                result.append((char) (((c - 'a' + 13) % 26) + 'a'));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
