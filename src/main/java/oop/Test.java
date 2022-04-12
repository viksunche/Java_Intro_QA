package oop;

public class Test {
    public static void main (String[] args){
        Dog frenchie = new Dog();
        Address dogAddress = new Address();
        dogAddress.setCity("Sofia");
        dogAddress.setPostalCode(1164);
        dogAddress.setStreetName(" Minzuhar street");

        frenchie.setAge(1);
        frenchie.setBreed("French Bulldog");
        frenchie.setHasTail(false);
        frenchie.setName("Morti");
        frenchie.printData();

        Parrot parrot = new Parrot();
        Address parrotAddress = new Address();
        parrotAddress.setCity("Plovdiv");
        parrotAddress.setPostalCode(3200);
        parrotAddress.setStreetName("Vasil Levski street");

        parrot.setAge(5);
        parrot.setBreed("Ara");
        parrot.setHasTail(true);
        parrot.setName("Moni");
        parrot.printData();

        frenchie.run();
        parrot.run();
        frenchie.jump();
        parrot.jump();

    }
}
