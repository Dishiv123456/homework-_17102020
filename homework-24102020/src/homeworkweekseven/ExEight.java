package homeworkweekseven;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class CityNameIfElse {
    /* Input anybe  alphabet from a to f and print their city name accordingly (use if else) any other
      Alphabet should invalid entry
     */

    public static void main(String[] args) {  //main method
        Scanner s = new Scanner(System.in);  // used Scanner to take input from user
        System.out.println("Enter alphabet from a to f : ");
        char name = s.next().toLowerCase().charAt(0);

        System.out.println(name + " start with city name is : ");
        if (name == 'a' ) {   //used nestred if else loop to fine city name
            System.out.println("Ahmedabad");
        } else if (name == 'b') {
            System.out.println("Baroda");
        } else if (name == 'c') {
            System.out.println("Chandigarh");
        } else if (name == 'd') {
            System.out.println("Delhi");
        } else if (name == 'e') {
            System.out.println("Ellora");
        } else if (name == 'f') {
            System.out.println("Firozpur");
        } else {
            System.out.println("Alphabet is not valid");
        }
    }
}



