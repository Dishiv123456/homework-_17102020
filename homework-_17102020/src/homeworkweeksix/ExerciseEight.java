package homeworkweeksix;
//Write a program to calculate area of triangle

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        ExerciseEight e = new ExerciseEight();
        e.areaOfTriangle();

    }

    public void areaOfTriangle() {
        Scanner s = new Scanner(System.in); //Scanner
        System.out.println("Enter width of the triangle : ");
        int width = s.nextInt();
        System.out.println("Enter length of the triangle :");
        int length = s.nextInt();
        int area = (width * length) / 2; // standard formula for triangle
        System.out.println("Area of the triangle is :  " + area);
    }

}
