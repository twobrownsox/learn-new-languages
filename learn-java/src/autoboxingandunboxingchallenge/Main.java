package autoboxingandunboxingchallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("My Bank");

    public static void main(String[] args) {

        showInstructions();
        boolean quit = false;
        while (!quit) {

            System.out.print("Enter option (0 to show options): ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    showInstructions();
                    break;
                case 1:
                    listAllCustomers();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    postCustomerTransaction();
                    break;
                case 5:
                    showCustomerBalance();
                    break;
                case 6:
                    showCustomerTransactions();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    showInstructions();
                    break;
            }

        }

    }

    private static void showInstructions() {
        System.out.println("Please select an option:");
        System.out.println("\t 0 - Show options");
        System.out.println("\t 1 - List All Customers");
        System.out.println("\t 2 - Add Branch");
        System.out.println("\t 3 - Add Customer");
        System.out.println("\t 4 - Post Customer Transaction");
        System.out.println("\t 5 - Show Customer Balance");
        System.out.println("\t 6 - Show Customer Transactions");
        System.out.println("\t 7 - Quit");
    }

    private static void listAllCustomers() {
        System.out.println("All Customers: ");
        for (int i=0; i<bank.getBranches().size(); i++) {
            Branch branch = bank.getBranches().get(i);
            for (int j=0; j<branch.getCustomers().size(); j++) {
                Customer customer = branch.getCustomers().get(j);
                System.out.println("Branch " + branch.getBranchName() + " Customer " + customer.getCustomerName() + " Balance " + customer.getBalance());
            }
        }
    }

    private static void addBranch() {
        System.out.print("Enter Branch Name: ");
        String branchName = scanner.nextLine();
        bank.addBranch(branchName);
    }

    private static void addCustomer() {

        System.out.print("Enter Branch Name: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter Initial Amount: ");
        double initialAmount = scanner.nextDouble();

        Branch branch = bank.findBranch(branchName);
        if (branch != null) {
            bank.addCustomer(branch, customerName, initialAmount);
        } else {
            System.out.println("Branch " + branchName + " not found");
        }

    }

    public static void postCustomerTransaction() {

        System.out.print("Enter Branch Name: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        Branch branch = bank.findBranch(branchName);
        if (branch != null) {
            Customer customer = branch.findCustomer(customerName);
            if (customer != null) {
                bank.addCustomerTransaction(branch,customer,amount);
            } else {
                System.out.println("Customer " + customerName + " not found at branch " + branchName);
            }
        }

    }

    private static void showCustomerBalance() {

        System.out.print("Enter Branch Name: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        Branch branch = bank.findBranch(branchName);
        if (branch != null) {
            Customer customer = branch.findCustomer(customerName);
            if (customer != null) {
                double balance = bank.getCustomerBalance(branch,customer);
                if (balance >= 0) {
                    System.out.println("Balance is " + balance);
                } else {
                    System.out.println("Error getting balance");
                }
            }
        }

    }

    private static void showCustomerTransactions() {

        System.out.print("Enter Branch Name: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        Branch branch = bank.findBranch(branchName);
        if (branch != null) {
            Customer customer = branch.findCustomer(customerName);
            if (customer != null) {
                bank.showCustomerTransactions(branch,customer);
            }
        }
    }

}
