package automation.qa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Please enter the number of weekday");
        int dayOfTheWeek = scanner.nextInt();
        switch (dayOfTheWeek){
            case 1:
                System.out.println(" You entered 1, so the week day is MoNday.");
            break;
            case 2:
                System.out.println(" You entered 2, so the week day is Tuesday.");
                break;
            case 3:
                System.out.println(" You entered 3, so the week day is Wednesday.");
                break;
            case 4:
                System.out.println(" You entered 4, so the week day is Thursday.");
                break;
            case 5:
                System.out.println(" You entered 5, so the week day is Friday.");
                break;
            case 6:
                System.out.println(" You entered 6, so the week day is Saturday.");
                break;
            case 7:
                System.out.println(" You entered 7, so the week day is Sunday.");
                break;

            default:
                System.out.println(" You entered incorrect value.");


        }
        double height = 12;
        double length = 6.5;
        double rectangleArea = ( height * length);
        double rectanglePerimeter = ( (2*height)+ (2*length));
        System.out.println( " The area of the rectangle is " + rectangleArea);
        System.out.println( " The perimeter of the rectangle is " + rectanglePerimeter);


        System.out.println("Please enter a number");
        int number = (scanner.nextInt());
        if ( number > 0){
            System.out.println( " The number is positive.");
        }else if ( number<0){
            System.out.println("The number is negative.");
        }

        System.out.println("Please enter a first random number");
        int firtsNumber = scanner.nextInt();
        System.out.println("Please enter a second random number");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter a third random number");
        int thirdNumber = scanner.nextInt();
        int largest = firtsNumber;
        if (secondNumber>largest)largest=secondNumber;
        if (thirdNumber>largest)largest=thirdNumber;
        System.out.println("The largest number is :" + largest);
    }

}
