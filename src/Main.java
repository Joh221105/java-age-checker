package src;

import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Hi, what year were you born in? (or type 'exit' to quit): ");
            try {
                if (scanner.hasNext("exit")) {
                    continueRunning = false;
                    break;
                }

                int birthYear = scanner.nextInt();
                int age = calculateAge(birthYear);
                displayResult(age);

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number for your birth year.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    public static int calculateAge(int birthYear) {
        int year = Year.now().getValue();
        return year - birthYear;
    }

    public static void displayResult(int age) {
        if (age > 125) {
            System.out.println("Are you sure you typed in your year of birth correctly?");
        } else if (age < 0) {
            System.out.println("Please enter a valid age.");
        } else {
            System.out.println("I have calculated your age to be: " + age + " or " + (age - 1));
        }
    }
}