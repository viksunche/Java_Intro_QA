package oop;

public class Parrot extends Pet{

    @Override
    public void run() {
        System.out.println(super.getName() + " is flying...");
    }

    public void talk(){
        System.out.println("I can talks.");
    }
}
