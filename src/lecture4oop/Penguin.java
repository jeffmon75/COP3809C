package lecture4oop;

public class Penguin extends Bird{
    public Penguin(String animalName, double animalWeight){
        super(animalName, animalWeight);
    }
    @Override
    public void move(){
        System.out.println("Waddles...");
    }
}
