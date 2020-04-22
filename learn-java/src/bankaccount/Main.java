package bankaccount;

public class Main {

    public static void main(String[] args) {

//        BankAccount myAccount = new BankAccount();
        BankAccount myAccount = new BankAccount(123456,100.00,"Mr A Smith","asmith@email.com","+442921123456");

        System.out.println("Account: " + myAccount.getNumber()
                + ", Name: " + myAccount.getCustomerName()
                + ", Email: " + myAccount.getCustomerEmail()
                + ", Phone: " + myAccount.getPhoneNumber()
                + " Balance: " + myAccount.getBalance());

        myAccount.deposit(49.25);
        myAccount.withdraw(11.13);
        myAccount.withdraw(327.99);
        myAccount.withdraw(138.12);

        BankAccount account2 = new BankAccount("Fred","fred@email.com","0125679321");
        System.out.println("Account: " + account2.getNumber()
                + ", Name: " + account2.getCustomerName()
                + ", Email: " + account2.getCustomerEmail()
                + ", Phone: " + account2.getPhoneNumber()
                + " Balance: " + account2.getBalance());

    }

}
