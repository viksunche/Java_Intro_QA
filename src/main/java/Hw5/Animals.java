package Hw5;

public class Animals implements AnimalActions {

    private String name;
    private int age;
    private Breed breed;

    public String getName(){
            return name;
        }

    public int setName(String name) {
            if (!name.isEmpty()){
                this.name=name;}
            else {
                System.out.println( "Invalid data! ");
            }
     public int getAge(){return age;
        }

    public Breed getBreed() {
        return breed;
    }

       @Override
    public void sing(){
        System.out.println( name +" is singing...");
    }

    @Override
    public void sing() {
            System.out.println( name + " is singing..");
    }

    @Override
    public void sleep(){
        System.out.println( name + "is sleeping..");
    }

    public void setAge(int i) {
        if ( age > 0){
            this.age = age;
        }else {
            System.out.println( "Invalid data!");
        }
    }

    public void setBreed;(Breed breed) {
        if(!breed.equals(null)){
            this.breed = breed;
        }else {
            System.out.println(" Invalid data.");
        }
    }

    public void printData() {
        System.out.println(" This mouse name is %s%n," +
                " This mouse age is: %d %n This mouse breed is: %.%n, name age, breed");
    }

        @Override
        public void sing() {

        }

        @Override
        public void sleep() {
        }

    }