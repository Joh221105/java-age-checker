package src;
import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what year were you born in?: ");
        int birthYear = scanner.nextInt();
        int year = Year.now().getValue();
        int age = year - birthYear;
        if (age > 125){
            System.out.print("Aer you sure you typed in your year of birth correctly?");
        }
        else{
            System.out.print("I have calculated your age to be: " + age + " or " + (age-1));
        }
    }
}