package lecture2;

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for a:");
        int a = input.nextInt();
        System.out.println("Enter a value for b:");
        int b = input.nextInt();
        System.out.println("Enter a value for c:");
        int c = input.nextInt();

        int discriminant = b*b-4*a*c;

        System.out.println("The discriminant is " + discriminant);
    }
}
