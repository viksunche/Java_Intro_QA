package loops;

public class WhileDemo {
    public static void main(String[] args) {
        int number = 0;

        while ( number<10){
            System.out.println("Current number is "+ number);
            number++;

            calculateFactorial(1);
            calculateFactorial(2);
            calculateFactorial(5);
        }
    }


    public static void calculateFactorial(int number) {
        int factorial = 1;
        int iterator = number;
        while ( iterator > 0)
        factorial *= iterator;
        iterator--;

    }

}
