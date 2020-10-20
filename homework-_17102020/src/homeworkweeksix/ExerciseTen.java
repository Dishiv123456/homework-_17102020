package homeworkweeksix;
/*
Write a Java program that takes a number as input and prints
 its multiplication table up to 10. Test Data: Input a number: 8
*/
import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        ExerciseTen obj = new ExerciseTen();
        obj.multiplicationTable();
    }

    public void multiplicationTable() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for multiplication table: ");
        int a = s.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }
}