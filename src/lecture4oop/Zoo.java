package lecture4oop;

public class Zoo {
    public static void main(String args[]){
        Tiger tiger = new Tiger("Tony", 350.00);
        tiger.getAnimalInformation();
        tiger.sleep();
        tiger.eat();

        Parrot parrot = new Parrot("Polly", 2.5);
        parrot.getAnimalInformation();
        parrot.fly();
        parrot.move();

        Penguin penguin = new Penguin("Pen", 25);
        penguin.getAnimalInformation();
        penguin.move();
    }
}
