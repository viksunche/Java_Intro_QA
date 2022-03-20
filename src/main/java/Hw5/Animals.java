package Hw5;

public class Animals implements AnimalActions {

    private String name;
    private int age;
    private String breed;

    public String getName(){
            return name;
        }

    public int setName(String name) {
            if (!name.isEmpty()){
                this.name=name;}
            else {
                System.out.println( "Invalid data! ");
            }
     public int getAge() {
                return age;
        }
     public void setAge(int age){
                if ( age > 0){
                    this.age = age;
                }else {
                    System.out.println( "Invalid data!");
                }

        }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }