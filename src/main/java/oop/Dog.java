package oop;

public class Dog {
    private boolean hasTail;
    private String name;
    private int age;
    private String breed;

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void printData(){
        System.out.printf("This dog name is: %s.%nThis dog's age: %d.%nThis dog's breed is: %s.%n", name, age, breed);
        if(hasTail){
            System.out.println("This dog has tail.");
        }else {
            System.out.println("This dog doesn't have tail.");
        }
    }
}
