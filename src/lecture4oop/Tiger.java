package lecture4oop;

public class Tiger extends Animal{
    public Tiger(String animalName, double animalWeight){
        super(animalName, animalWeight);
    }
    @Override
    public void move(){
        System.out.println("Shakes...");
    }

}
