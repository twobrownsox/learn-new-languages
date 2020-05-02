package encapsulation;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim"; // changing the name in the class means all field names need to change as well!
//        player.health = 20; // easy to forget to set a field value rather than using a constructor with validation
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200; // can set fields publicly overriding logic in method
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200,"Sword");
        System.out.println("Initial health is " + player.getHealth());

    }

}
