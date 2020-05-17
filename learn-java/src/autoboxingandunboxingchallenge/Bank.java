package autoboxingandunboxingchallenge;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addBranch (String branchName) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            this.branches.add(new Branch(branchName));
            System.out.println("Branch " + branchName + " added to Bank " + this.bankName);
        } else {
            System.out.println("Branch " + branchName + " already exists at Bank " + this.bankName);
        }
    }

    public void addCustomer(Branch branch, String customerName, double initialAmount) {
        if (this.branches.contains(branch)) {
            Customer customer = branch.findCustomer(customerName);
            if (customer == null) {
                branch.addCustomer(customerName,initialAmount);
            }
        } else {
            System.out.println("Branch " + branch.getBranchName() + " does not exists at Bank " + this.bankName);
        }
    }

    public void addCustomerTransaction(Branch branch, Customer customer, double amount) {
        if (this.branches.contains(branch)) {
            if (branch.getCustomers().contains(customer)) {
                branch.addCustomerTransaction(customer, amount);
            }
        } else {
            System.out.println("Branch " + branch.getBranchName() + " does not exists at Bank " + this.bankName);
        }

    }

    public double getCustomerBalance(Branch branch, Customer customer) {
        if (this.branches.contains(branch)) {
            if (branch.getCustomers().contains(customer)) {
                return customer.getBalance();
            } else {
                System.out.println("Customer " + customer.getCustomerName() + " does not exist at branch " + branch.getBranchName());
            }
        } else {
            System.out.println("Branch " + branch.getBranchName() + " does not exists at Bank " + this.bankName);
        }
        return -1;
    }

    public void showCustomerTransactions(Branch branch, Customer customer) {
        if (this.branches.contains(branch)) {
            if (branch.getCustomers().contains(customer)) {
                System.out.println("Transactions for " + customer.getCustomerName());
                for (int i=0; i<customer.getTransactions().size(); i++) {
                    System.out.println(customer.getTransactions().get(i));
                }
            } else {
                System.out.println("Customer " + customer.getCustomerName() + " does not exist at branch " + branch.getBranchName());
            }
            System.out.println("Branch " + branch.getBranchName() + " does not exists at Bank " + this.bankName);
        }

    }

    public Branch findBranch(String branchName) {
        for (int i=0; i<this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

}
