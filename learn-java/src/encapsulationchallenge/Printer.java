package encapsulationchallenge;

public class Printer {

    private int tonerLevel = 100;
    private int numberPagesPrinted = 0;
    private boolean isDuplex = false;

    public Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    public void addToner(int amount) {
        if ((this.tonerLevel+amount <= 100)) {
            this.tonerLevel += amount;
        } else {
            this.tonerLevel = 100;
        }
        System.out.println("Toner filled - level: " + this.tonerLevel);
    }

    public void printPage(int pages) {
        if (isDuplex()) {
            System.out.println("Printing in duplex mode");
            if (pages < 2) {
                numberPagesPrinted = 2;
            } else {
                numberPagesPrinted += ((pages/2) + (pages%2));
            }
        } else {
            numberPagesPrinted += pages;
        }
        tonerLevel -= (pages*5);
        if (getTonerLevel() <= 0) {
            System.out.println("Printer toner needs refilling");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPagesPrinted() {
        return numberPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
