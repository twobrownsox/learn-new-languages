package switchproject;

public class Main {

    public static void main(String[] args) {

        char character = 'B';
        switch(character){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found " + character);
                break;
            default:
                System.out.println("Not found");
        }

        String myString = "JanuarY";
        switch(myString.toLowerCase()){
            case "january":
                System.out.println("January");
                break;
            case "february":
                System.out.println("February");
                break;
            default:
                System.out.println("Don't know");
                break;
        }

    }

}
