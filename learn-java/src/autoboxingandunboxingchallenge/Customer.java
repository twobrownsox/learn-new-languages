package autoboxingandunboxingchallenge;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public void showTransactions() {
        System.out.println("Transactions for " + this.customerName + ":");
        for (int i=0; i<this.transactions.size(); i++) {
            System.out.println(this.transactions.get(i));
        }
    }

    public double getBalance() {
        double balance = 0.00;
        for (int i=0; i<this.transactions.size(); i++) {
            balance += this.transactions.get(i);
        }
        return balance;
    }

}
