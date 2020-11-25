package collectionhomework;

import java.util.ArrayList;

import java.util.Collections;

public class Q1 {
    //Write a Java program to reverse an array of integer values.

    public static void main(String[] args) {
        Q1 obj = new Q1();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(9);
        arrayList.add(102);
        arrayList.add(175);
        arrayList.add(211);
        arrayList.add(205);
        System.out.println("Elements before reversing : "+arrayList);
        Collections.reverse(arrayList);
        System.out.println("After reverse Elements  : " + arrayList);


    }

}
