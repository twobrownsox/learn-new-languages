package autoboxingandunboxingchallenge;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(String customerName, double initialAmount) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            customer = new Customer(customerName);
            this.customers.add(customer);
            customer.postTransaction(initialAmount);
            System.out.println("Customer " + customerName + " added to branch " + this.branchName + ". Initial amount " + initialAmount);
        } else {
            System.out.println("Customer " + customerName + " already exists at branch " + this.branchName);
        }
    }

    public void addCustomerTransaction(Customer customer, double amount) {
        if (this.customers.contains(customer)) {
            customer.postTransaction(amount);
            System.out.println("Posted " + amount + " to account for " + customer.getCustomerName() + " at branch " + this.branchName);
        } else {
            System.out.println("Customer " + customer.getCustomerName() + " does not exist at branch " + this.branchName);
        }
    }

    public Customer findCustomer(String customerName) {
        for (int i=0; i<this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getCustomerName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

}
