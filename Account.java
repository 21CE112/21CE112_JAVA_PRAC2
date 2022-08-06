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
class Account
{
    private static int ID=0;
    private double balance;
    private double annualInterestRate=7;
    private Date date;
//here we use getter setter
    public static int getID() {
        
        return ID;
        
    }
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
//here we use Default constructor
    public Account()
    {
        ID = 0;
        balance = 500;
        annualInterestRate = 7;
    }
//here we use paramiterrized constructor
    public Account(int id,double b)
    {
        ID = id;
        balance = b;
    }
//here we make some methods for application
    public double getMonthlyInterestRate()
    {
        return ((float)annualInterestRate/12);
    }

    public double getMonthlyInterest()
    {
        return ((float)annualInterestRate/100)/12;
    }
    
    public void withdraw(double a)
    {
        balance-=a;
        System.out.println("Your current balance is:-"+balance);
    }

    public String toString()
    {
        Date d = new Date();
        System.out.println(d);
        setDate(d);
        return ("Account id is :- " + getID() + "\nYour Balance is:- " + getBalance() + "\n Account created on date:- " + d + "\nMonthly Interest is:-  "+getMonthlyInterest());
    }
}