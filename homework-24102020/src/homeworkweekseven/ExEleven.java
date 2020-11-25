package homeworkweekseven;

public class NumberDivide {
    //WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) { //for loop to print 1 to 100 number
            if (num % 3 == 0)              //if used to print number divide by 3
                System.out.print(num + ",");
        }
        System.out.println(" (all numbers are divided by 3)");
        for (int num = 1; num <= 100; num++) { //for loop to print 1 to 100 number
            if (num % 5 == 0) {     //if used to print number divide by 3
                System.out.print(num + ",");
            }
        }
        System.out.println(" (all numbers are divided by 5)");
    }
}
