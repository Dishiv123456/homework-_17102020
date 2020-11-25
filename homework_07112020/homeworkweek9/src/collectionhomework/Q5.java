package collectionhomework;

import java.util.ArrayList;

public class Q5 {
    // Write a Java program to test an array list is empty or not.

    public static void main(String[] args) {
        ArrayList<Integer> emptyOrNot = new ArrayList<Integer>();
        boolean answer = emptyOrNot.isEmpty();
        System.out.println("Before adding :  ");
        if (answer == true) {
            System.out.println("The ArrayList is empty : ");
        } else {
            System.out.println("The ArrayList is not empty : ");

        }
        emptyOrNot.add(4);
        emptyOrNot.add(6);
        emptyOrNot.add(8);
        System.out.println("After adding Elements : ");
        answer=emptyOrNot.isEmpty();
        if (answer==true){
            System.out.println("The ArrayList is empty : ");
        }else {
            System.out.println("The ArrayList is not empty : ");
        }
    }

}
