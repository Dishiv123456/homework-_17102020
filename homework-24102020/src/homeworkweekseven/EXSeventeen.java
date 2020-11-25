package homeworkweekseven;

public class SumArray {
    // Write a Java program to sum values of an array.
    public static void main(String[] args) {  //main method
        arraysum();  //static method called direct to static area
    }

    public static void arraysum() {  //static method
        int[] i = new int[]{10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int j = 0; j < i.length; j++)
            sum = sum + i[j];
        System.out.println("Sum values of an array is: " + sum);
    }
}
