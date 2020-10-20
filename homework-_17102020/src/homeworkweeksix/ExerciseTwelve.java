package homeworkweeksix;
/* Write a Java program to compute the specified expressions and print the output.
Test Data:((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output :  2.138888888888889  */

public class ExerciseTwelve {

    public static void main(String[] args) {
        ExerciseTwelve tw = new ExerciseTwelve();
        tw.specifiedExpressions();
    }

    public void specifiedExpressions() {
        System.out.println("Test Data  (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)  = " + (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5) + " Expected Output");
    }
}
