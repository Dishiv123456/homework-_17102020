package collectionhomework;

import java.util.ArrayList;

public class Q3 {
    //Write a Java program to iterate through all elements in a array  list.
    public static void main(String[] args) {
        ArrayList<String> cityName = new ArrayList<String>();
        cityName.add("Surat");
        cityName.add("Baroda");
        cityName.add("Bharuch");
        cityName.add("London");
        cityName.add("Bhavnagar");
        for (String elements:cityName){
            System.out.println(elements);
        }
    }

}
