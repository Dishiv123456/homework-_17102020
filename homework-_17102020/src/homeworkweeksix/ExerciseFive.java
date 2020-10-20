package homeworkweeksix;

public class ExerciseFive {
    /* Write a program for a calculator with addition, subtraction, multiplication
       and division methods all with parameters and use string concatenation methods.
       2 methods should be static and 2 methods are instance */
    public static void main(String[] args) {  //main method
        ExerciseFive e = new ExerciseFive();  //object created to call instance method

        e.addition(10, 20);
        e.subtraction(30, 20);
        multiplication(5, 5);
        division(10, 5);
    }

    public void addition(int a, int b) {    //instance method
        ExerciseFive e = new ExerciseFive();   //object
        System.out.println("addition =   " + (a + b));
    }

    public void subtraction(int a, int b) { //instance method

        System.out.println("subtraction =   " + (a - b));
    }

    public static void multiplication(int a, int b) {  // static method
        System.out.println("multiplication =   " + (a * b));
    }

    public static void division(int a, int b) { // static method
        System.out.println("division =   " + (a / b));
    }
}
