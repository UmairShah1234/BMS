package BankingSystem;

import Account.Account;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    private List<Account> accounts = new ArrayList<>();

    public void createAccount(Account account){
        accounts.add(account);
        account.getTransactionHistory().add("Account Created");
    }

    public void getAllAccounts(){
        for (Account account: accounts ){
            System.out.println(account.getName());
        }
    }

    public Account getAccount(long accountNumber){
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public long getbalance(Account account){
        return account.getBalance();
    }

    public void withdraw(Account account, long amount){
        if (account.getBalance() > amount ){
            account.setBalance(account.getBalance() - amount);
            account.getTransactionHistory().add(amount+" has been withdrawn");
        }else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(Account account,long amount){
        account.setBalance(account.getBalance() + amount);
        account.getTransactionHistory().
                add(amount+" has been deposited and your total balance is "+ account.getBalance());
    }


}
