package homeworkweeksix;

public class ExerciseTwo {

    /*Declare two static variable outside main method.
      Declare main method
      Call below one method in main method
      Declare one static method and call those two variables */

    static String empName = "Ram"; //static variable
    static int empID = 123;

    public static void main(String[] args) {  // main method
        empDetail();  // static method to static direct call
    }

    public static void empDetail() {  // static method
        System.out.println("empName is " + empName);  //static variable direct called
        System.out.println("empID is " + empID);
    }


}
