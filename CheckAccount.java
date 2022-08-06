//This program is Ceated By Aryaan Rabara 21CE112
//https://github.com/21CE112/21CE112_JAVA_PRAC2.git
/*(Subclasses of Account) In Programming Exercise 2, the Account class was
defined to model a bank account. An account has the properties account number,
balance, annual interest rate, and date created, and methods to deposit and
withdraw funds. Create two subclasses for checking and saving accounts. A
checking account has an overdraft limit, but a savings account cannot be
overdrawn. Draw the UML diagram for the classes and then implement them.
Write a test program that creates objects of Account, SavingsAccount, and
CheckingAccount and invokes their toString() methods.
 */
import java.util.Scanner;
 class CheckAccount extends Account{

    private double OverdraftLimit;
//here we use getter setter
    public double getOverdraftLimit() {
        return this.OverdraftLimit;
    }

    public void setOverdraftLimit(double OverdraftLimit) {
        this.OverdraftLimit = OverdraftLimit;
    }
//here we use Default Constructor
    CheckAccount()
    {
        super();
        OverdraftLimit = -10;
    }
    //here we use paramiterrized constructor
    CheckAccount(int id,double balance,double over)
    {
        super(id,balance);
        OverdraftLimit = over;
    }
//here we make some methods for application
    public void withdraw(double amount)
    {
        if(getBalance() - amount < OverdraftLimit)
        {
            System.out.println("Overdraft Limit warning..!! \n You Cannot withdraw Money");
        }
        else
        {
            amount = getBalance() - amount;
            setBalance(amount);
        }
    }
//toString function will print all data in String formate
    public String toString()
    {
        return (super.toString() + "\nOverDraft Limit:- " + getOverdraftLimit());
    }
}
