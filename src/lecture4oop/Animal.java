package lecture4oop;

public abstract class Animal {
    private String animalName;
    private double animalWeight;

    public Animal(String animalName, double animalWeight){
        this.animalName = animalName;
        this.animalWeight = animalWeight;
    }
    public void getAnimalInformation(){
        System.out.println("This is " + animalName
                + ".  They weigh " + animalWeight + "lbs.");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public abstract void move();
}
