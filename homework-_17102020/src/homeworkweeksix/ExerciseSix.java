package homeworkweeksix;

/*Write a program to enter any radius value of
circle and find out the area.(Formula of Area A=PI*r*r) */

import java.util.Scanner;

import static java.lang.Math.PI;

public class ExerciseSix {
    public static void main(String[] args) { //main method
        ExerciseSix a = new ExerciseSix();  //object created
        a.radiusOfCircle();  //instance method called by using object ref.

    }

    public void radiusOfCircle() {  //instance method
        Scanner s = new Scanner(System.in);  // Scanner use to take value from user
        System.out.println("Enter radius value of circle ");
        double r = s.nextDouble();
        double area = PI * r * r; // formula
        System.out.println("Area of the circle is =   " + area);
    }
}
