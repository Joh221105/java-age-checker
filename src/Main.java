package src;
import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what year were you born in?: ");
        try{
            int birthYear = scanner.nextInt();
            int age = calculateAge(birthYear);
            if (age > 125){
                System.out.print("Are you sure you typed in your year of birth correctly?");
            }
            else if (age < 0){
                System.out.print("Please enter a valid age");
            }
            else{
                System.out.print("I have calculated your age to be: " + age + " or " + (age-1));
            }
        }
        catch(InputMismatchException e){
            System.out.print("Please enter a number for your age");
        }

    }

    public static int calculateAge(int birthYear){
        int year = Year.now().getValue();
        return year - birthYear;
    }
}