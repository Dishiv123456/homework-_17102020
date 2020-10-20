package homeworkweeksix;

//Write a Java program to swap two variables
public class ExerciseFifteen {

    static int a = 10;
    static int b = 20;
    static int c;

    public static void main(String[] args) {   //main method

        ExerciseFifteen ft = new ExerciseFifteen();  //object created
        ft.swapToVariables();

    }

    public void swapToVariables() {  //instance method
        System.out.println("Before swap a = " + a + "  and b =" + b);
        c = a + b;
        b = b - a;
        a = c - a;
        System.out.println("After swap  a = " + a + "  and b =" + b);

    }
}
