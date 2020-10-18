public class MethodExample {
    public static void main(String[] args) {
        MethodExample obj = new MethodExample();

        obj.addition();
        obj.addition1(10, 20);
        obj.printMyName("varsha");
        int c = addition2();
        System.out.println(c);

        System.out.println(obj.addition3(1,2,3));
        System.out.println(obj.addition3(10,20,30));

    }
    //no return type and no parameters

    public void addition() {
        System.out.println("This is addition method");
    }

    // no return type with parameters
    public void addition1(int a, int b) {
        System.out.println(a + b);

    }

    public void printMyName(String name) {
        System.out.println(name);
    }

    //with return type and no parameters
    public static int addition2() {
        int a = 10;
        int b = 20;
        int result = a + b;
        return result;
    }

    public boolean idChild() {
        return true;

    }

    //with return type with parameter
    public int addition3(int a, int b, int c) {
        return a + b + c;

    }

}
