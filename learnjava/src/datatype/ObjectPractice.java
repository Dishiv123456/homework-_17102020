package datatype;

public class ObjectPractice {
    int a=10;
    static int b =20;

    public static void main(String[] args) {
        ObjectPractice obj= new ObjectPractice();  //object creation
        System.out.println(obj.a);
        System.out.println(b);
    }
    public void myFirstMethod(){
        System.out.println(a);
        System.out.println(b);

    }
}
