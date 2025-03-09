/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caesarcipher;

/**
 *
 * @author arooj fatima
 */
import java.util.Scanner;

public class Caesarcipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the message from the user
        System.out.print("Your secret message: ");
        String message = scanner.nextLine();

        // Step 2: Get the shift key from the user
        System.out.print("Your secret key: ");
        int shift = scanner.nextInt();
        scanner.close();

        // Step 3: Encrypt the message
        String encryptedMessage = encryptMessage(message, shift);

        // Step 4: Display the encrypted message
        System.out.println("The encoded message: " + encryptedMessage);
    }

    public static String encryptMessage(String message, int shift) {
        StringBuilder encrypted = new StringBuilder();

        // Loop through each character in the message
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {  // Check if it's a letter
                char base = Character.isUpperCase(c) ? 'A' : 'a';  // Handle uppercase and lowercase
                char encryptedChar = (char) ((c - base + shift) % 26 + base);
                encrypted.append(encryptedChar);
            } else {
                encrypted.append(c); // Keep spaces and special characters unchanged
            }
        }
        return encrypted.toString();
    }
}
