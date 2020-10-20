package homeworkweeksix;
//Write a program to convert the upper case to lower case

public class ExerciseNine {
    String str = "THIS IS MY TEXTBOOK"; //instance  variable

    public static void main(String[] args) { //main method
        upperCaseToLowerCase();  //static method called direct to static area

    }

    public static void upperCaseToLowerCase() {
        ExerciseNine a = new ExerciseNine(); // object created to call instance variable in static area

        System.out.println(a.str.toLowerCase());//used pre define method from library
    }
}