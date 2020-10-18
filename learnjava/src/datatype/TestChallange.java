package datatype;

public class TestChallange {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        TestChallange t = new TestChallange();
        t.addition();
        addition1();
    }

    public void addition() {

        System.out.println(a);
        System.out.println(b);


    }

    public static void addition1() {
        TestChallange t = new TestChallange();
        System.out.println(t.a);
        System.out.println(b);
    }
}
