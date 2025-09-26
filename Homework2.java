
package homework2;

import java.util.Scanner;
public class Homework2 {

    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter annual interest rate : ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years : ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount : ");
        double loanAmount = input.nextDouble();

        // Calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Calculate monthly payment
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - 1 / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

        // Calculate total payment
        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Display results
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", totalPayment);

       
    }
}
