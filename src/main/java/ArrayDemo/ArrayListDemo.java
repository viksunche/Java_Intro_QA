package ArrayDemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Sofia");
        cities.add(0,"Varna");
        cities.add("London");

        System.out.println("Citoes before Brexit are: " + cities);

        cities.remove("London");

        System.out.printf("Citoes before Brexit are: %s%n", cities);
        System.out.println(cities.indexOf("Sofia"));
    }

}