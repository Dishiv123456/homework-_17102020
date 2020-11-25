package homeworkweekseven;

import sun.text.normalizer.UCharacter;

import java.util.Scanner;

public class AlphabetOrSymbol {

    //Write a program that tells us input value is number or an alphabet or symbol

    public static void main(String[] args) {  //main method
        Scanner s = new Scanner(System.in);  //Scanner used for users input
        System.out.println("enter number,alphabet or symbol  :  ");
        char a = s.next().toLowerCase().charAt(0);
        if ((a >= 'a' && a <= 'z')) {  //if condition to check Alphabet
            System.out.println("it is a alphabet");
        } else if (a >= '0' && a <= '9') {  //else if condition to check number
            System.out.println("it is a number");

        } else {         //else to check Symbol
            System.out.println("it is a Symbol");
        }
    }
}
