package homeworkweekseven;

import java.util.Scanner;

public class EvenOrOdd {
    /* Write a java program that tell us that Input number is odd or even?
       HINT: use turnery operator (? :)   */
    public static void main(String[] args) {  //main method
        Scanner s = new Scanner(System.in);  //used Scanner to take input from user
        System.out.print("Enter any number to check even or odd : ");
        int num = s.nextInt();
        String message = num % 2 == 0 ? "Number is even" : "Number is odd"; // check number is even or odd using ternary operator
        System.out.println(message);

    }

}
