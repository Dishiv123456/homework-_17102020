package homeworkweeksix;

public class ExerciseTwenty {

    /*Write a Java Program to print as below.

"+------------------------+"
"|                        |"
"|      CORNER STORE      |"
"|                        |"
"| 2015-03-29  04:38PM    |"
"|                        |"
"| Gallons:       10.870  |"
"| Price/gallon: $ 2.089  |"
"|                        |"
"| Fuel total:  $ 22.71   |"
"|                        |"
"+------------------------+"   */

    public static void main(String[] args) {  //main method
        ExerciseTwenty tw = new ExerciseTwenty();  //object created
        tw.cornerShop();
    }
    public void cornerShop() {  //instance method
        System.out.println("\"+-----------------------+\"");
        System.out.println("\"|                       |\"");
        System.out.println("\"|     CORNER  STORE     |\"");
        System.out.println("\"|                       |\"");
        System.out.println("\"| 2015-03-29   04:38PM  |\"");
        System.out.println("\"|                       |\"");
        System.out.println("\"| Gallons:       10.870 |\"");
        System.out.println("\"| Price/gallon: $ 2.089 |\"");
        System.out.println("\"|                       |\"");
        System.out.println("\"| Fuel total:  $22.70   |\"");
        System.out.println("\"|                       |\"");
        System.out.println("\"+-----------------------+\"");
    }
}
