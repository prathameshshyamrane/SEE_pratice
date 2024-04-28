package practice;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Add the numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("Sum: " + sum);
        System.out.println("242");
    }
}