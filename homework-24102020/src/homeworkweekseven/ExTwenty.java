package homeworkweekseven;

public class ArraySpecificValue {
    //Write a Java program to test if an array contains a specific value



        public static void main(String[] args) {
            int[] num = {1, 2, 3, 4, 5};
            int contains = 3;
            boolean xyz = false;

            for (int n : num) {
                if (n == contains) {
                    xyz = true;
                    break;
                }
            }

            if(xyz)
                System.out.println(contains + " is found.");
            else
                System.out.println(contains + " is not found.");
        }

    }