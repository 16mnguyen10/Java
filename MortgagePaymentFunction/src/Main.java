/*
    Michael Nguyen
    October 21, 2022

    Project 1: Mortgage Payment Function
 */

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Getting known values
        System.out.print("Enter the amount borrowed: $");
        Scanner principal = new Scanner(System.in);
        int p = principal.nextInt();

        System.out.print("Enter the interest rate: ");
        Scanner intRate = new Scanner(System.in);
        double r = intRate.nextDouble();

        System.out.print("Enter the total number of payments: ");
        Scanner numPayment = new Scanner(System.in);
        int n = numPayment.nextInt();

        // Developing the payment function
        double numerator = r * Math.pow(1 + r, n);
        double denominator = Math.pow(1 + r, n) - 1;
        double monthlyPayment = p * (numerator / denominator);

        // Print the monthly payment amount
        System.out.println("Mortgage Rate: $" +
                (double)Math.round(monthlyPayment * 100) / 100);
    }
}


/*
Variable Names:
M = Monthly Payment
P = Principal
r = Interest Rate
n = Number of payments

Formula:
M = P * ((r * (1 + r)^n))/ ((1+r)^n - 1)
*/