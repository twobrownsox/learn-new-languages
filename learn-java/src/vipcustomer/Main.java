package vipcustomer;

public class Main {

    public static void main(String[] args) {

        VipCustomer vip1 = new VipCustomer();
        System.out.println("name: " + vip1.getName()
                + ", credit limit: " + vip1.getCreditLimit()
                + ", email address: " + vip1.getEmailAddress());

        VipCustomer vip2 = new VipCustomer("vip2",20000.00);
        System.out.println("name: " + vip2.getName()
                + ", credit limit: " + vip2.getCreditLimit()
                + ", email address: " + vip2.getEmailAddress());

        VipCustomer vip3 = new VipCustomer("vip3",30000.00,"vip3@email.com");
        System.out.println("name: " + vip3.getName()
                + ", credit limit: " + vip3.getCreditLimit()
                + ", email address: " + vip3.getEmailAddress());

    }
    
}
