package homeworkweeksix;

public class ExerciseFour {

    /* Declare two instance variable and Declare two static variable outside main method.
       Declare main method
       Call below two method in main method
       Declare one instance method and call those four variables.
       Declare one static method and call those four variables. */

    int a = 10;  // instance variable
    int b = 20;
    static int c = 30; //static variable
    static int d = 40;

    public static void main(String[] args) {  //main method
        ExerciseFour abc = new ExerciseFour(); // object
        add1();  //static method called
        abc.add();  // instance method called
    }

    public void add() {  // instance method
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

    public static void add1() {   // static method
        ExerciseFour abc = new ExerciseFour();  ///object created
        System.out.println(abc.a);
        System.out.println(abc.b);
        System.out.println(c);
        System.out.println(d);
    }

}
