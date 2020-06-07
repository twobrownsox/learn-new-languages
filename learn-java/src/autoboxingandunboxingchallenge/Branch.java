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
        if (getCustomerIndex(customerName) < 0) {
            this.customers.add(new Customer(customerName,initialAmount));
            System.out.println("Customer " + customerName + " successfully added to branch " + this.branchName);
        } else {
            System.out.println("Customer " + customerName + " already exists at branch " + this.branchName);
        }
    }

    public Customer findCustomer(String customerName) {
        int index = getCustomerIndex(customerName);
        if (index >= 0) {
            return this.customers.get(index);
        }
        System.out.println("Customer " + customerName + " not found at branch " + this.branchName);
        return null;
    }

    private int getCustomerIndex(String customerName) {
        for (int i=0; i<this.customers.size(); i++) {
            if (this.customers.get(i).getCustomerName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

}
