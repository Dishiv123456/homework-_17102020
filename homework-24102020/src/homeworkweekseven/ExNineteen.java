package homeworkweekseven;

import java.util.Scanner;

public class AverageValueArray {


    //Write a Java program to calculate the average value of array  elements.
    public static void main(String[] args) {  //main method
        AverageValueArray a = new AverageValueArray(); // object created to call instance method
        a.average();
    }
    public void average() {  //instance method

        int i = 0;   //local variable
        int[] num = new int[]{10, 20, 30, 40, 50};
        int sum = 0;
        for (i = 0; i < num.length; i++)  // used for loop to chech lenght of the []
            sum = sum + num[i];
        double average = sum / num.length;
        System.out.println("average value of array  elements = " + average);
    }
}