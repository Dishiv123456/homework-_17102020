package homeworkweekseven;

import java.util.Scanner;

public class AddSubMulDiv {
    /*WAP to input any two number and ask user to enter their symbol (+, -, /, *) find addition,
    Subtraction, multiplication and division according to their symbol (using if else)  */
    public static void main(String[] args) {  //main method
        Scanner s = new Scanner(System.in); //Scanner to take input from user
        System.out.print("Enter first number : ");
        int num1=s.nextInt();
        System.out.print("Enter second number : ");
        int num2=s.nextInt();
        System.out.print("Enter symbol (+, -, /, *) : ");
        char sym=s.next().charAt(0);
        if(sym=='+'){            //nestred if else loop
            System.out.println(num1 +"+"+num2+"="+ (num1+num2));
        }else if (sym =='-'){
            System.out.println(num1 +"-"+num2+"="+ (num1-num2));
        }else if(sym =='*'){
            System.out.println(num1 +"*"+num2+"="+ (num1*num2));
        }else if(sym =='/' ){
            System.out.println(num1 +"/"+num2+"="+ (num1/num2));
        }else {
            System.out.println("incorrect symbol ");
        }


        }
    }



