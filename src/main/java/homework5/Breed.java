package homework5;

public class Breed {
    private String breedName;

    public void setBreedName(String breedName){
        if (!breedName.isEmpty()){
            this.breedName = breedName;
        }else {
            System.out.println("Invalid data");
        }
    }
    public Breed(String breedName){
        setBreedName(breedName);
    }
}
