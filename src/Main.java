import Account.Account;
import BankingSystem.BankingSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();
        Boolean choice = true;
        long balance;
        long accountNumber;
        long amount;
        Scanner sc = new Scanner(System.in);
        int ch;

        while (choice != false){
            System.out.println("Menu");
            System.out.println("1. Create Your Account");
            System.out.println("2. View Account ");
            System.out.println("3. Get Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.println("Enter Your Input: ");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter Your Name");
                    String name = sc.next();
                    System.out.println("Enter Your Balance");
                    balance = sc.nextLong();

                    Account newAccount = new Account(name,balance);

                    bank.createAccount(newAccount);
                    System.out.println(bank.getAccount(newAccount.getAccountNumber()).getAccountNumber());
                    break;
                case 2:
                    System.out.println("Enter Your Account Number: ");
                    accountNumber = sc.nextLong();
                    Account account = bank.getAccount(accountNumber);
                    System.out.println("Account: "+account.getAccountNumber());
                    System.out.println("Name: "+ account.getName());
                    System.out.println("Balance: "+account.getBalance());

                case 3:
                    System.out.println("Enter Your Account Number: ");
                    accountNumber = sc.nextLong();
                    balance = bank.getbalance(bank.getAccount(accountNumber));
                    System.out.println("Your Balance is: "+balance);
                    break;
                case 4:
                    System.out.println("Enter Your account number: ");
                    accountNumber = sc.nextLong();
                    System.out.println("Enter amount: ");
                    amount = sc.nextLong();
                    bank.deposit(bank.getAccount(accountNumber),amount);
                    break;
                case 5:
                    System.out.println("Enter Your account Number: ");
                    accountNumber = sc.nextLong();
                    System.out.println("Enter amount: ");
                    amount = sc.nextLong();
                    bank.withdraw(bank.getAccount(accountNumber),amount);
                case 6:
                default:break;
            }


        }
       }
}