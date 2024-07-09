package session_10_java_OOP_concepts.practice.bank_account;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public double withdraw(double amount){
        if(balance > amount){
            return balance - amount;
        }
        System.out.println("You don't have enough money");
        return balance;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return balance;
    }

    public void setAccountBalance(double accountBalance) {
        this.balance = accountBalance;
    }

 }
