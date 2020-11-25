package homeworkweekseven;

import java.util.Scanner;

public class SevenDaysOfWeek {
    /* Write a Java program which input any number between 1 to 7 and it print The Days name MONDAY, TUESDAY…..
    SUNDAY of the week accordingly by using switch. NOTE: if number is out of selection Print message “Week
    contains 1 to 7 days”  */

    public static void main(String[] args) { //main method
        Scanner s = new Scanner(System.in);  //Scanner for users input
        System.out.println("Enter number from  1 to 7 :  ");
        int day = s.nextInt();
        switch (day) {  //switch statments
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(" week contains 1 to 7 days");
        }
    }
}
