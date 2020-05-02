package encapsulationchallenge;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(true);

        printer.printPage(1);
        System.out.println("pages printed: " + printer.getNumberPagesPrinted() + ", toner level: " + printer.getTonerLevel());
        printer.printPage(5);
        System.out.println("pages printed: " + printer.getNumberPagesPrinted() + ", toner level: " + printer.getTonerLevel());
        printer.printPage(10);
        System.out.println("pages printed: " + printer.getNumberPagesPrinted() + ", toner level: " + printer.getTonerLevel());
        printer.printPage(4);
        System.out.println("pages printed: " + printer.getNumberPagesPrinted() + ", toner level: " + printer.getTonerLevel());

        if (printer.getTonerLevel() <= 0) {
            printer.addToner(100);
        }

    }

}
