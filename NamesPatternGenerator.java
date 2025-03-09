/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.namepattern;

/**
 *
 * @author arooj fatima
 */

import java.util.Scanner;

public class NamepatternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for full name
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();

        // Spliting
        String[] nameParts = fullName.split(" ");

        String firstName = nameParts[0].toUpperCase();
        String lastName = nameParts[1].toUpperCase();

        // Print the pattern 
       
        printnamepattern(firstName);
        printnamepattern(lastName);

        scanner.close();
    }

    // Method 
    public static void printnamepattern(String name) {
        for (int i = name.length(); i > 0; i--) {
            System.out.println(name.substring(0, i));
        }
        for (int i = 1; i <= name.length(); i++) {
            System.out.println(name.substring(0, i));
        }
    }
}