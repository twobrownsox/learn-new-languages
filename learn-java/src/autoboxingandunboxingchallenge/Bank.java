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
        if (getBranchIndex(branchName) < 0) {
            this.branches.add(new Branch(branchName));
            System.out.println("Branch " + branchName + " added to Bank " + this.bankName);
        } else {
            System.out.println("Branch " + branchName + " already exists at Bank " + this.bankName);
        }
    }

    public Branch findBranch(String branchName) {
        int index = getBranchIndex(branchName);
        if (index >= 0) {
            return this.branches.get(index);
        }
        System.out.println("Branch " + branchName + " not found");
        return null;
    }

    private int getBranchIndex(String branchName) {
        for (int i=0; i<this.branches.size(); i++) {
            if (this.branches.get(i).getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public void listAllCustomers() {
        System.out.println("All Customers: ");
        for (int i=0; i<this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            System.out.println("Branch " + branch.getBranchName() + ":");
            for (int j=0; j<branch.getCustomers().size(); j++) {
                Customer customer = branch.getCustomers().get(j);
                System.out.println("\t" + customer.getCustomerName() + " Balance " + customer.getBalance());
            }
        }
    }

}
