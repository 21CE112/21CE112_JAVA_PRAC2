//GitHub:https://github.com/21CE112/21CE112_JAVA_PRAC2.git
//This program is created by Aryaan Rabara 21CE112
/*Aim:Use the Account class created as above to simulate an ATM machine.
Create 10 accounts with id AC001.....AC010 with initial balance 300₹. The
system prompts the users to enter an id. If the id is entered incorrectly, ask
the user to enter a correct id. Once an id is accepted, display menu with
multiple choices.
1. Balance inquiry
2. Withdraw money [Maintain minimum balance 300₹]
3. Deposit money
4. Money Transfer
5. Create Account
6. Deactivate Account
7. Exit
Hint: Use ArrayList, which is can shrink and expand with compared to Array.*/

import java.util.*;
class AC
{
    static int ID=1;//will have total number of Accounts
    int id;//will store ID of particular / indivudual Account.

    AC(int id)
    {
        this.id = id;
        //Constuctor For assigning id to each Account when they are created.
        //pass the static ID as an argument so that it can Assign the ids to Accounts in Ascending order.
        //suppose for the first Account ID will be 1 then rest will be Assigned as 2,3,4,5....
    }
    //gettes and setters for id and balance
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double balance=300;//initial balance 300

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void printID() {
        System.out.printf("Your Account ID is :-  "+"AC"+"%03d\n",ID);
        //this will print the account numbers in the format AC001....AC010 when invoked
        //for id=1 --> %3d will left 2 spaces and print 1 at the end and %03d will fill those blank spaces with 0
        ID++;
    }
    
    public void balanceInquiry()
    {
        System.out.println("Balance of account id "+id+" is:- "+balance);
    }
    public void withdrawMoney(double money)
    {
        if(money>balance)
        {
            //for overwithdraw limit
            System.out.println("Not sufficient Balance");
        }
        else if(balance<=300)
        {
            //for maintaining minimum balance
            System.out.println("Soryy..You can not Withdraw money.. \n Maintain Proper Balance");
        }
        else
        {
            System.out.println("You have withdrawn "+money+" Rupees");
            balance = balance - money;
            System.out.println("Now you have "+balance+" Rupees balance left");
        }
    }
    public void deposit()
    {
        double money;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount you want to deposit:-"); 
        money = sc.nextDouble();
        balance = balance + money;
        System.out.println("Your balance is:-"+balance);
        
    }
    public void moneyTransfer(ArrayList<AC> l)
    {
        //here money will be transferred to one account to another so pass whole arraylist as argument so it can get both the required ids...one for taking money and one for transferring money.
        double money;
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("To  which account number do you want to transfer money?");
        id = sc.nextInt();
        System.out.println("Enter the amount of money you want to transfer to id "+id);
        money = sc.nextDouble();
        AC a = l.get(--id);
        if(money>=this.balance)
        {
            System.out.println("Can't Transfer Money \n Insufficient Balance...");
        }
        else if(this.balance<=300)
        {
            System.out.println("Soryy..You can not transfer money.. \n Maintain Proper Balance");
        }
        else
        {
        a.balance = a.balance + money;
        this.balance = this.balance - money;
        System.out.println(money+" Rupees has been Transfered from ID "+this.id+" to ID "+a.id);
        System.out.println("Remaining balance in ID "+this.id+" is "+this.balance+" rupees");
        System.out.println("\n Balance in ID "+a.id+" is "+a.balance);
        }
        
    }
    public void createAccount(ArrayList<AC> a)
    {
        //new account will be added in the Arraylist so pass it as the argument and add new object of AC class using add function.
        a.add(new AC(ID));
        AC.printID();
    }
    public void Deactivate(ArrayList<AC> a,int ID)
    {
        // Iterator<AC> itr = a.iterator();
        // itr.remove(--ID);
        //the same thing can be done using iterator.
        a.remove(--ID);//suppose for removing 10th ID ..it will be at 9th index --> --ID
        AC.ID--; // bcoz After removing we will have only 9 accounts left
    }
}