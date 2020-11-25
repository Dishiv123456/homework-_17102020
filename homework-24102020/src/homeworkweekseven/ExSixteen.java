package homeworkweekseven;

import java.util.Arrays;

public class NumericArray {
    //Write a Java program to sort a numeric array and a string  array.
    public static void main(String[] args) {
        NumericArray n = new NumericArray();
        n.arrayNumeric();
    }

    public void arrayNumeric() {

        int[] a = {10, 90, 70, 40, 50, 60};
        String[] city = {"Delhi", "Surat", "Bhavnagar", "Rajkot", "Baroda"};
        System.out.println("Before sorting numeric array : " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Ater sorting numeric array  : " + Arrays.toString(a));
        System.out.println("Before sorting String array : " + Arrays.toString(city));
        Arrays.sort(city);
        System.out.println("After sorting String array  : " + Arrays.toString(city));
    }


}
