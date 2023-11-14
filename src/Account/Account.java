package Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Account {
    private String name;
    private long accountNumber;
    private long balance;
    private List<String> transactionHistory = new ArrayList<>();
    long number = 100000000000L;

    Random random = new Random();

    public Account(String name , long balance ){
        this.name = name;
        this.accountNumber = Math.abs(random.nextLong());
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactionHistory(List<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }
}
