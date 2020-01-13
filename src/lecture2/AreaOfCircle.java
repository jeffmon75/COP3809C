package lecture2;

public class AreaOfCircle {
    public static double getAreaOfCircle(double radius){
        return Math.PI*Math.pow(radius,2);
    }

    public static void main (String[] args){
        double radius = 20;
        //double area = Math.PI*Math.pow(radius,2);
        double area = getAreaOfCircle(radius);
            System.out.println(area);
    }
}
