package data.type;

import java.util.Scanner;

public class HwString {
    public static void main(String[] args) {

        String testString = " My name is <MyName>";

        System.out.println( " Your name is : ");

        Scanner scanner = new Scanner (System.in);

        String myName = scanner.nextLine();

        String newString = testString.replace( "MyName", myName);

        System.out.println ("First String: " + testString );

        System.out.println("New String:" + newString);

        if (testString.equals(newString)){
            System.out.println("Strings are eqaul.");
        }else {
            System.out.println("Strings are not equal.");
        }

        System.out.println( " Count the number of words on it.");
        String beCounted = scanner.nextLine();
        String [] stringArray = beCounted.split( "");
        System.out.println( "\" " + beCounted + "\" " + "has" + stringArray.length + " words.");

            }
    }

