package homework5;

public class Test {
    public static void main (String []args){
        Mouses animation = new Mouses();

        animation.printData();
        animation.setAge(23);
        animation.setBreed(new Breed("Mrrr Mouse"));
        animation.setName("Mini Mouse");
        animation.printData();
    }




}
