package datatype;

public class Variables {
    int x = 100;  // instance variable or globle variables
    int z=200;
    String myName = "Varsha"; // instance variable // globle variables

    static int y = 200;//static variable // globle variables
    static String yourName = "Varsha";  //static variable  //globle variables

    public void myFirstMethod() {
        int a = 10;  //local variables
        String name = "Varsha";  //local variable
        System.out.println(a);
        System.out.println(name);
        System.out.println(x);
        System.out.println(myName);
        int c=x+y;

    }

    public void mySecondMethod() {
        //   System.out.println(a);
        // System.out.println(name);
        System.out.println(x);
        System.out.println(myName);

    }

    public static void mythirdMethos() {
        Variables obj= new Variables(); //object creation ----instance variable  to static area
        System.out.println(y);
        System.out.println(yourName);
        System.out.println(obj.x);
        System.out.println(obj.z);

    }
}
