package org.yearup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        //constant
        final int MONTH_IN_YEAR = 12;
        final int PERCENT = 100;

        //declare variables
        double principal;
        double annualInterest;
        int loanLength;


        // user input
        System.out.print("Enter Principle: ");
        principal = userInput.nextDouble();

        System.out.print("Enter Annual Interest Rate: ");
        annualInterest = userInput.nextDouble();
        annualInterest = annualInterest / PERCENT / MONTH_IN_YEAR;

        System.out.print("Enter loan term: ");
        loanLength = userInput.nextInt();
        loanLength = loanLength * MONTH_IN_YEAR;
        principal = (principal * annualInterest) / (1 - Math.pow(1 + annualInterest, - loanLength));

        //output
        System.out.printf("Monthly Payments: " + principal);









        //User input
        //loan amount
        //interest rate per year
        //laonterm in years

        //output
        //monthlypayment
        //totaInterestPaid



    }
}