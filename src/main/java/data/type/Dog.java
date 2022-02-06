package data.type;

public class Dog {
    private String name;
    private byte age;
    private static String breed;
    public final static String TAIL = " long";

    public String getBreed(){
        return breed;
    }


    public static void setBreed(String breed) {
        Dog.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void barf(){

        String dogAction = "Barking...";

        System.out.println("the dog name: " + name + " and age: " + age  + dogAction);
    }





}
