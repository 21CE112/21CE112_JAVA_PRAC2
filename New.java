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
Hint: Use ArrayList, which is can shrink and expand with compared to Array.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;*/

public class New
{
    public static void main(String[] args) 
    {
        System.out.println("This program is created by Aryaan Rabara 21CE112");
        // AC a[] = new AC[10];
        ArrayList<AC> l = new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            l.add(new  AC(AC.ID));
            //always add objects this way ...we can't add them as creating fisrt then add using for loop it will add the objects to list but we wont be able to get them back from list it will throw an error of Nullpointer
            AC.ID++;
        }
        int n;
        final boolean i=true;
        Scanner sc = new Scanner(System.in);
        //creating an infinite loop for continuously taking input.
        while(i)
        {
            
            // AC b = itr.next();
            // System.out.println(b.balance);
            // System.out.println(b.id);
            
            //here next will return an object but that object will contain Null values so we have to use if else or try catch and assign memory to it
            // if(b==null)
            // {
            //     b = new AC();
            //     b.id = AC.ID++;
            // }
            
            System.out.println("Enter your pin in Digits:-");
            n = sc.nextInt();
            if(n>(AC.ID-1) || n==0)
            {
                System.out.println("Incorrect ID please Try again...");
                continue;
            }
            else
            {
                AC b = l.get(--n);

                System.out.println("Press 1 for Balance Inquiry \n Press 2 to Withdraw Money \n Press 3 to Deposit money \n Press 4 to Tranfer Money \n Press 5 to create a new Account \n Press 6 to deactivate Your account \n Press 7 to Exit \n Enter Your Choice :-");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                    b.balanceInquiry();
                    break;

                    case 2:
                    System.out.println("Enter the amount you want to Withdraw:-");
                    double money = sc.nextDouble();
                    b.withdrawMoney(money);
                    break;

                    case 3:
                    b.deposit();
                    break;

                    case 4:
                    b.moneyTransfer(l);
                    break;

                    case 5:
                    b.createAccount(l); 
                    break;

                    case 6:
                    System.out.println("Confirm Your ID:-");
                    int ID = sc.nextInt();
                    b.Deactivate(l, ID);
                    break;

                    case 7:
                    System.exit(0);

                    default:
                    System.out.println("Invalid Input..!! \n Try again...");
                }
            }
        }
        
    }
}