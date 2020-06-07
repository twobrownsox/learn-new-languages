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
                    bank.listAllCustomers();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    addCustomerTransaction();
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

    private static void addBranch() {
        String branchName = getStringInput("Enter Branch Name: ");
        bank.addBranch(branchName);
    }

    private static void addCustomer() {
        Branch branch = bank.findBranch(getStringInput("Enter Branch Name: "));
        if (branch != null) {
            String customerName = getStringInput("Enter Customer Name: ");
            double initialAmount = getDoubleInput("Enter Initial Amount: ");
            branch.addCustomer(customerName,initialAmount);
        }
    }

    public static void addCustomerTransaction() {
        Branch branch = bank.findBranch(getStringInput("Enter Branch Name: "));
        if (branch != null) {
            Customer customer = branch.findCustomer(getStringInput("Enter Customer Name: "));
            if (customer != null) {
                customer.addTransaction(getDoubleInput("Enter Amount: "));
            }
        }

    }

    private static void showCustomerBalance() {
        Branch branch = bank.findBranch(getStringInput("Enter Branch Name: "));
        if (branch != null) {
            Customer customer = branch.findCustomer(getStringInput("Enter Customer Name: "));
            if (customer != null) {
                System.out.println("Balance for customer " + customer.getCustomerName() + " is " + customer.getBalance());
            }
        }

    }

    private static void showCustomerTransactions() {
        Branch branch = bank.findBranch(getStringInput("Enter Branch Name: "));
        if (branch != null) {
            Customer customer = branch.findCustomer(getStringInput("Enter Customer Name: "));
            if (customer != null) {
                customer.showTransactions();
            }
        }
    }

    private static String getStringInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    private static double getDoubleInput(String message) {
        System.out.print(message);
        double amount = scanner.nextDouble();
        scanner.nextLine();
        return amount;
    }

}
