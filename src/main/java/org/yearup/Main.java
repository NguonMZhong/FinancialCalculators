package org.yearup;

import java.text.NumberFormat;
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
        double monthlyPayment;
        double amountOverTime;
        double totalInterest;


        // user input
        System.out.print("Enter Principle Amount: ");
        principal = userInput.nextDouble();


        System.out.print("Enter Annual Interest Rate: ");
        annualInterest = userInput.nextDouble();
        annualInterest = annualInterest / PERCENT / MONTH_IN_YEAR;

        System.out.print("Enter loan term: ");
        loanLength = userInput.nextInt();
        loanLength = loanLength * MONTH_IN_YEAR;
        monthlyPayment = (principal * annualInterest) / (1 - Math.pow(1 + annualInterest, - loanLength));

        //output
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));

        amountOverTime = monthlyPayment * loanLength;
        System.out.println("Total payback amount over time: " + NumberFormat.getCurrencyInstance().format(amountOverTime));

        //A calculator that determines future value of one-time deposit assuming compound interest
        System.out.println("-------------------------------------------------------------------------------------");

        final int PERCENT1 = 100;

        //variable
        double deposit;
        double rate;
        double term;
        double compoundInterest;
        double futureValue;

        System.out.print("Enter your deposit: " );
        deposit = userInput.nextDouble();

        System.out.print("Enter your interest rate: ");
        rate = userInput.nextDouble();

        System.out.print("Enter your term: ");
        term = userInput.nextInt();

        futureValue = deposit * (Math.pow((1 + rate / PERCENT1), term)) - deposit;
        System.out.println("Future Value: " + NumberFormat.getCurrencyInstance().format(futureValue));

        //Calculator that determines the present value of an ordinary annuity
        System.out.println("-------------------------------------------------------------------------------------");

        //
        double paymentAmount;
        double expectedInterestRate;
        int years;
        double presentValue;
        int payoutPeriod;


        //present value = periodic payment
        //time (time in years) r= annual interest rate

        //user input
        System.out.print("Enter payment amount: ");
        paymentAmount = userInput.nextDouble();

        System.out.print("Enter interest rate: ");
        expectedInterestRate = userInput.nextDouble();

        System.out.print("Enter number of years: ");
        years = userInput.nextInt();

        //calculate
        double ratePerPayoutPeriod = expectedInterestRate / MONTH_IN_YEAR;
        int totalNumPayment = years * MONTH_IN_YEAR;
        presentValue = paymentAmount * ( ratePerPayoutPeriod / (1 -Math.pow(1 + ratePerPayoutPeriod, -totalNumPayment)));

        //output
        System.out.println("Present Value: " + NumberFormat.getCurrencyInstance().format(presentValue));



















        //User input
        //loan amount
        //interest rate per year
        //laonterm in years

        //output
        //monthlypayment
        //totaInterestPaid



    }
}