package guessing_number_7_times;

import java.util.Scanner;

public class Guessing_Number_7_times {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int random_number = 0 + (int) (Math.random() * 101);
        int user_guess;
        int attempts = 0;
        int maximum_attempts = 7;

        System.out.println("We find a number!");
        System.out.println("Now it is your turn to guess");
        System.out.println("you just have 7 tries");

        while (attempts < maximum_attempts) {
            System.out.println("Enter the number");
            user_guess = input.nextInt();
            attempts++;

            if (user_guess > random_number) {
                System.out.println("The number is greater than random number");
            } else if (user_guess < random_number) {
                System.out.println("The number that you enterd is smaller than the random number");
            } else {
                System.out.println("CONGRATS");
            }
            break;
        }
        
    }
}
