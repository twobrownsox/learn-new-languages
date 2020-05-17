package autoboxingandunboxingchallenge;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void postTransaction(double amount) {
        this.transactions.add(amount);
    }

    public double getBalance() {
        double balance = 0.00;
        for (int i=0; i<this.transactions.size(); i++) {
            balance += this.transactions.get(i);
        }
        return balance;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
