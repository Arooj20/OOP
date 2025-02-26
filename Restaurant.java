/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant;

/**
 *
 * @author arooj fatima
 */
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Declare attributes
        String type;
        String ingredients;
        String cuisine;

        // Take user input
        System.out.print("Enter the type of dish (e.g., Sweet, Savory): ");
        type = scanner.nextLine();

        System.out.print("Enter the ingredients (comma-separated): ");
        ingredients = scanner.nextLine();

        System.out.print("Enter the cuisine (e.g., Indian, Chinese, Italian): ");
        cuisine = scanner.nextLine();

        // Output the results
        System.out.println("\nWelcome to the " + cuisine + " Restaurant!"); // Dynamic restaurant name
        System.out.println("Your selected choice of Dish is: " + type);
        System.out.println("Your Dish contains the following ingredients: " + ingredients);
        System.out.println("Your Dish belongs to the " + cuisine + " cuisine.");

        // Close the scanner
        scanner.close();
    }
}


