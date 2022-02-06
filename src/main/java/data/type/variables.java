package data.type;

public class variables {
    public static void main(String[] args) {

        byte age = 120;
        char someRandomchar = 'n';
        //int someq = 2;
        //long somep = 5;
        //float somew = 10;
        //double w = 16;

        String someRandomString = " Random String";

        Dog myDog = new Dog();
        myDog.setName("Rex");
        myDog.setAge((byte) 2);
        myDog.setBreed("Pitbull");

        System.out.println(" My dog name:" + myDog.getName());
        System.out.println(" My dog age:" + myDog.getAge());

        myDog.setAge((byte) 4);
        System.out.println(" My dog age:" + myDog.getAge());

        Dog myDog2 = new Dog();
        myDog2.setName(" Puch");
        myDog2.setAge((byte) 2);
        myDog2.setBreed("German shepard");

        System.out.println("first dog breed is:" + myDog.getBreed());
        System.out.println("second dog breed is:" + myDog2.getBreed());

        myDog.barf();
    }
}
