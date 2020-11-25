package homeworkweekseven;

import java.util.Scanner;

public class PrintMarkSheet {
    /*Write a java program to input student Name, roll No, and three subjects Math, Science and English marks (marks is
     between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”) and
     find out total, percentage and result.If he is pass or fail on basis of percentage (pass>=35) and also give them
     grade >= 80 A+, >= 60 A, >= 50 B, >= 35 C And print Mark Sheet in following format _______________________________
*/
    public static void main(String[] args) {
        studentDetails();
    }

    public static void studentDetails() {
        String name;
        int roll_no, maths, science, english;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Student name : ");
        name = s.next();
        System.out.print("Enter Roll No : ");
        roll_no = s.nextInt();
        System.out.print("enter Maths mark : ");
        maths = s.nextInt();
        if (maths >= 0 && maths <= 100) {
        } else {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("marks for Maths: ");
            maths = s.nextInt();
        }
        System.out.print("enter Science mark : ");
        science = s.nextInt();
        if (maths >= 0 && maths <= 100) {
        } else {
            System.out.print("Invalid Input, Marks should between 0 to 100");
            System.out.print("marks for Science: ");
            science = s.nextInt();
        }
        System.out.print("Enter English Mark : ");
        english = s.nextInt();
        if (maths >= 0 && maths <= 100) {
        } else {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("marks for English: ");
            english = s.nextInt();
        }
        int total;
        total = (maths + science + english);
        System.out.print("Total: ");
        System.out.println(total);

        double per = (double) total / 300 * 100;
        System.out.print("Percentage: ");
        System.out.println(per + " %");
        System.out.print("Result: ");
        if (per >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.print("Grade: ");
        if (per >= 80) {
            System.out.println("A+");
        } else if (per < 80 && per >= 60) {
            System.out.println("A");
        } else if (per < 60 && per >= 50) {
            System.out.println("B");
        } else if (per < 50 && per >= 35) {
            System.out.println("C");
        } else if (per < 35) {
            System.out.println("F");
        }

        System.out.println("| _____________________________________________| ");
        System.out.println("|            |");
        System.out.println("|Mark Sheet  |");
        System.out.println("|______________________________________________|");
        System.out.println("|Name        :        " + (name) + "      |");
        System.out.println("|Roll No     :        " + (roll_no) + "        |");
        System.out.println("|______________________________________________|");
        System.out.println("|Subjects    :       Marks       |");
        System.out.println("|______________________________________________|");
        System.out.println("|Maths       :       " + (maths) + "          |");
        System.out.println("|Science     :       " + (science) + "          |");
        System.out.println("|English     :       " + (english) + "          |");
        System.out.println("|______________________________________________|");
        System.out.println("|Total       :       " + (total) + "         |");
        System.out.println("|______________________________________________|");
        System.out.println("|Percentage  :       " + (per) + "%      |");
        System.out.print("| Result       :       "); //+ "Pass" + "       |");
        if (maths >= 35 && science >= 35 && english >= 35) {
            System.out.println("Pass        |");
        } else {
            System.out.println("Fail        |");
        }
        System.out.print("|      Grade               :        ");
        if (per >= 80) {
            System.out.println("A+         |");
        } else if (per < 80 && per >= 60) {
            System.out.println("A          |");
        } else if (per < 60 && per >= 50) {
            System.out.println("B          |");
        } else if (per < 50 && per >= 35) {
            System.out.println("C          |");
        } else if (per < 35) {
            System.out.println("F          |");
        }
        System.out.println("|______________________________________________|");


    }
}