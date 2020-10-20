package homeworkweeksix;

public class ExerciseThree {
    /*Declare one instance variable and Declare one static variable outside main method.
      Declare main method
      Call below two method in main method
      Declare one instance method and call those two variables.
      Declare one static method and call those two variables */

    int a = 10; // instance variable
    static int b = 20;  // static variable

    public static void main(String[] args) {   //main method
        ExerciseThree obj = new ExerciseThree();   // object created to call instance method
        obj.myInstanceMethod();  //method called by using object
        myStaticMethod();
    }

    public void myInstanceMethod() { //instance method

        System.out.println(a);
        System.out.println(b);
    }

    public static void myStaticMethod() {  ///static method
        ExerciseThree obj = new ExerciseThree();  ///object created to call instance variable
        System.out.println(obj.a);
        System.out.println(b);
    }
}
