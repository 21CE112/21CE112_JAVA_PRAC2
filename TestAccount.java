//This program is created by Aryaan Rabara 21CE112
/*Design a class named Account that contains:
• A private int data field named id for the account (default 0).
• A private double data field named balance for the account (default 500₹).
• A private double data field named annualInterestRate that stores the current
interest rate (default 7%). Assume all accounts have the same interest rate.
• A private Date data field named dateCreated that stores the date when the
account was created.
• A no-arg constructor that creates a default account.
• A constructor that creates an account with the specified id and initial balance.
• The accessor and mutator methods for id, balance, and annualInterestRate.
• The accessor method for dateCreated.
• A method named getMonthlyInterestRate() that returns the monthly interest rate.
• A method named getMonthlyInterest() that returns the monthly interest.
• A method named withdraw that withdraws a specified amount from the account.
• A method named deposit that deposits a specified amount to the account.
 */
import java.util.*;
public class TestAccount {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Date D = new Date();
       

        //call the Static function directly by the class name.
        double b;
        System.out.println("Enter Your Balance:-");
        b = sc.nextDouble();
        Account a = new Account(Account.getID(),b);
        a.setDate(D);
        System.out.println("Date is :- "+ a.getDate());
        double amount;
        System.out.println("enter the amount to be withdrawn:-");
        amount = sc.nextDouble();
        a.withdraw(amount);
        b = a.getMonthlyInterestRate();
        System.out.println("Your monthly interest rate is:-"+b);
        b = a.getMonthlyInterest();
        System.out.println("Your monthly interest is:-"+b);
        System.out.println("This Program is Created by Aryaan Rabara 21CE112");
        sc.close();
    }
}