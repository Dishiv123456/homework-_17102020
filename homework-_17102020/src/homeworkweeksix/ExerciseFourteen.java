package homeworkweeksix;
/*Write a Java program to print the area and perimeter of a rectangle.
Test Data: Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20   */

public class ExerciseFourteen {

    double width = 5.60;  //instance variable
    double height = 8.50;
    double area = width * height;
    double perimeter = 2 * (width + height);

    public static void main(String[] args) {  //main method
        ExerciseFourteen.rectangle(); //static method called by using class name
    }

    public static void rectangle() { // static method
        ExerciseFourteen ex=new ExerciseFourteen(); // object created to call Instance variables

        System.out.println("Area is 5.6 * 8.5 =  " + ex.area);
        System.out.println("Perimeter is 2 * (5.6 + 8.5) = " + ex. perimeter);

    }

}

