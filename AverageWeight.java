package com.assignment;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalWeight = 0.0;
        int numberOfPeople = 10;

        for (int i = 1; i <= numberOfPeople; i++) {
            double weight = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Enter the weight of person " + i + ": ");
                    weight = scanner.nextDouble();

                    if (weight <= 0) {
                        System.out.println("Weight must be a positive number. Please try again.");
                    } else {
                        validInput = true;
                        totalWeight += weight;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear the invalid input
                }
            }
        }

        double averageWeight = totalWeight / numberOfPeople;
        System.out.println("The average weight of " + numberOfPeople + " people is: " + averageWeight + " kg");
    }
}
