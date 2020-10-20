package homeworkweeksix;

import java.util.Scanner;

public class ExerciseEighteen {
    /*   Write a Java program and compute the sum of the digits of an integer.


         Input Data  Input an integer: 25
         Expected Output The sum of the digits is: 7  */

    public static void main(String[] args) {  //main method
        Scanner s=new Scanner(System.in);  //Scanner
        System.out.println("Input Data  Input an integer");
        long n =s.nextLong();
        System.out.println("Expected Output The sum of the digits is:"+ sumDigit(n));
    }

   public static int sumDigit(long n) { //static method
       int sum = 0;
       while (n != 0) {
           sum += n % 10;
           n /= 10;

       }

       return sum;
   }

}
