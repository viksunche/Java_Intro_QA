package automation.qa;

import java.util.Scanner;

public class MyFirstJava {

    public static void main(String[] args) {

        //write the text in the console
        System.out.println("  Please enter your name: " );
        //Scanner is class for reading values in console
        Scanner scanner = new Scanner(System.in);

        String customer = scanner.next();

        /*System.out.println(" Read the name of customer: " +
                customer);*/

        System.out.println( " Please enter your hobby: ");

        String hobby = scanner.next();

        System.out.println( " Read the name of customer: " +
                customer + " Read the hobby of customer: " + hobby);

    }


}
