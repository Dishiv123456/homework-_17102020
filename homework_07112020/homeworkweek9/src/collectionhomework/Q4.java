package collectionhomework;

import java.util.ArrayList;

public class Q4 {
    //Write a Java program to retrieve an element (at a specified index) from a given  array list
    public static void main(String[] args) {
        ArrayList<Integer>retrieveElement =new ArrayList<Integer>();
        retrieveElement.add(1);
        retrieveElement.add(2);
        retrieveElement.add(3);
        retrieveElement.add(4);
        retrieveElement.add(5);
        retrieveElement.add(6);
        System.out.println("All the Elements : "+retrieveElement);

        int elements =retrieveElement.get(2);
        System.out.println("3rd Elements at 2nd Index : " +elements);



    }
}
