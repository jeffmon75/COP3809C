package lecture3Conditionals;

public class ConditionalExamples {
    public static boolean kittyTrouble(boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }
    public static void sleepIn(boolean weekday, boolean vacation){
        /*if(!weekday || vacation){
            System.out.println("Sleep In");
        }
        else{
            System.out.println("Don't sleep in.");
        }*/
        String result = (!weekday || vacation) ? "Sleep in" : "Don't sleep in.";
        System.out.println(result);
    }
    public static String notString(String str){
        if(str.length() >=3 && str.substring(0,3).equals("not")){
            return str;
        }
        return "not " + str;
    }
    public static void fizzBuzz(int number){
        String result = "";
        if (number % 3 == 0){
            result = "fizz";
        }
        if (number % 5 == 0){
            //result = result + "buzz";
            result += "buzz";
        }
        System.out.println(result);
    }

    public static void main(String args[]){
        //kittyTrouble(true, true)
        kittyTrouble( true, true);
        sleepIn(true, true);
    }
}
