package Hw5;

public class Test {
    public static void main (String []args){
        Mouses animation = new Mouses();

        animation.printData();
        animation.setAge(23);
        animation.setBreed(new Breed("Mrrr Mouse"));
        animation.setName("Mini Mouse");
        animation.printData();
    }
        Mouses mouses =new Mouses();
        mouses.setAge(40);
        mouses.setBreed(new Breed("Hhhhh Mouse"));
        mouses.setName("Micky Mouse");
        mouses.printData();



}
