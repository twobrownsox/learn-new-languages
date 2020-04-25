package bankaccount;

public class BankAccount {

    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount() {
        this(12678,20.00,"Default Customer Name","default@email.com","+0000000000");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int number, double balance, String customerName, String customerEmail, String phoneNumber ) {
        System.out.println("BankAccount constructor called with parameters ");
        // in constructors, don't call setters, use fields directly as setters might no tget called when considering inheritance
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String phoneNumber) {
        this(99999,100.55,customerName,customerEmail,phoneNumber);
    }

    public int getNumber() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        System.out.println("Current balance: " + getBalance() + ", Deposit " + amount + ", New balance = " + (getBalance() + amount));
        setBalance(getBalance()+amount);
    }

    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds. Unable to withdraw " + amount);
        } else {
            System.out.println("Current balance: " + getBalance() + ", Withdraw " + amount + ", New balance = " + (getBalance() - amount));
            setBalance(getBalance()-amount);
        }
    }

}
