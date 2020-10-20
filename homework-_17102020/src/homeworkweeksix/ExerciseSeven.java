package homeworkweeksix;

import java.util.Scanner;

public class ExerciseSeven {
/*Write a program to insert any temperature value in degree Fahrenheit
 and convert to degree Celsius((F − 32) × 5/9 = 0°C).
*/

    public static void main(String[] args) { //main method
        fahrenheitToCelsius();

    }

    public static void fahrenheitToCelsius() {  //static method
        Scanner s = new Scanner(System.in);  //Scanner to take input from user
        System.out.println(" Enter temperature value in degree Fahrenheit");
        int fahrenheit = s.nextInt();
        // int celsius = 5(fahrenheit−32) /9);
        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0); //standard formula
        System.out.println(fahrenheit + " fahrenheit" + "   =   " + celsius + " celsius");
    }

}
