package homeworkweeksix;

public class ExerciseNineteen {
    /*Write a Java program to convert a given string into lowercase.
      Sample Output:
      Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
      the quick brown fox jumps over the lazy dog.  */
    String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"; // instance variable

    public static void main(String[] args) { //main method
        stringToLowerCase();
    } //mail method

    public static void stringToLowerCase() { //static method
        ExerciseNineteen abc = new ExerciseNineteen(); //object created
        System.out.println("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG :  " + abc.input.toLowerCase());
    }

}

