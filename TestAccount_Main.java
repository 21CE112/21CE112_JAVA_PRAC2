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
public class TestAccount_Main {
    public static void main(String[] args) {
        
    //Here we call All methods by object of Account,SavingAccount,CheckAccount
    Account a =new Account(1,50000);
    SavingAccount s = new SavingAccount(1,50000);
    CheckAccount c = new CheckAccount(1,50000,10000);

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount you want to Withdraw:-");
    double amount = sc.nextDouble();
 
    c.withdraw(amount);
    System.out.println(c.toString());
    a.withdraw(amount);
    System.out.println(a.toString());
    s.Withdraw(amount);
    System.out.println(s.toString());
System.out.println("This program is Created by Aryaan Rabara 21CE112");

    }
    
}
