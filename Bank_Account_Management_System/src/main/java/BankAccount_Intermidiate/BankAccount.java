package BankAccount_Intermidiate;

import java.util.ArrayList;
import java.util.List;

public class BankAccount 
{
	
	    private double balance;
	    private List<String> transactionHistory;

	    public BankAccount() {
	        this.balance = 0.0;
	        this.transactionHistory = new ArrayList<>();
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public List<String> getTransactionHistory() {
	        return transactionHistory;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            transactionHistory.add("Deposited: " + amount);
	        } else {
	            throw new IllegalArgumentException("Deposit amount must be positive.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            transactionHistory.add("Withdrew: " + amount);
	        } else {
	            throw new IllegalArgumentException("Withdrawal amount must be positive and not exceed balance.");
	        }
	    }
	}


