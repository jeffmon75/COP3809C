package lecture4oop;

public class Parrot extends Bird implements IFlyable{
    public Parrot(String animalName, double animalWeight){
        super(animalName, animalWeight);
    }
    @Override
    public void fly(){
        System.out.println("Flying...");
    }
    @Override
    public void move(){
        System.out.println("Shimy...");
    }


}
