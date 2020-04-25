package whileloop;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while(count < 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while(true){
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count < 6);

        int number = 4;
        int finishNumber = 20;
        while(number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; // skip to the next loop iteration
            }
            System.out.println("Even number " + number);
        }

        number = 4;
        finishNumber = 20;
        int evenNumberCount = 0;
        while(number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; // skip to the next loop iteration
            }
            System.out.println("Even number " + number);

            evenNumberCount++;
            if (evenNumberCount >=5) {
                break;
            }
        }
        System.out.println("Total even numbers found:  " + evenNumberCount);

    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }

}
