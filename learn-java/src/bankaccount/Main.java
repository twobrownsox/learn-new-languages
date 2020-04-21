package bankaccount;

public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
//        BankAccount myAccount = new BankAccount(123456,100.00,"Mr A Smith","asmith@email.com","+442921123456");

//        myAccount.setNumber(123456);
//        myAccount.setCustomerName("Mr A Smith");
//        myAccount.setCustomerEmail("asmith@email.com");
//        myAccount.setPhoneNumber("+442921123456");
//        myAccount.setBalance(100.00);

        System.out.println("Account: " + myAccount.getNumber()
                + ", Name: " + myAccount.getCustomerName()
                + ", Email: " + myAccount.getCustomerEmail()
                + ", Phone: " + myAccount.getPhoneNumber()
                + " Balance: " + myAccount.getBalance());

        myAccount.deposit(49.25);
        myAccount.withdraw(11.13);
        myAccount.withdraw(327.99);
        myAccount.withdraw(138.12);

    }

}
