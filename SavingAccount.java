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
 class SavingAccount extends Account{

    public SavingAccount() {
       //siper keyword will pass the value to base class Constructor
        super();
    }

    
    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    public void Withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else{
            System.out.println("Error! Savings account overdrawn transtaction rejected");
        }
    
    }
}
