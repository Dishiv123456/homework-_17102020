package homeworkweeksix;

public class ExerciseOne {
    /*Declare two instance variable outside main method.
      Declare main method
      Call below one method in main method
      Declare one instance method and call those two variables */
    int a = 10; //instance variable or globle variable
    int b = 20;

    public static void main(String[] args) {  //main method
        ExerciseOne ex = new ExerciseOne();  // object
        ex.myFirstMethod();
    }

    public void myFirstMethod() {  //instance method
        ExerciseOne ex = new ExerciseOne();  //object
        System.out.println(ex.a);
        System.out.println(ex.b);

    }
}
