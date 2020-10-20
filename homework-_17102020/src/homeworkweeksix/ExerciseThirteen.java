package homeworkweeksix;

//Write a Java program that takes three numbers as input to calculate and print the average of the numbers

import java.util.Scanner;

public class ExerciseThirteen {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a =s.nextInt();
        System.out.println("Enter second number:");
        int b=s.nextInt();
        System.out.println("Enter third number:");
        int c=s.nextInt();
        double average = (a+b+c)/3;
        System.out.println("Average of three number is :"+average);

    }

}
