package carpetcostcalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter width :");
            double width = scanner.nextDouble();
            System.out.print("Enter Length :");
            double length = scanner.nextDouble();
            System.out.print("Enter cost : ");
            double cost = scanner.nextDouble();
            //while loop logic

            Carpet carpet = new Carpet(cost);
            Floor floor = new Floor(width, length);
            Calculator calculator = new Calculator(floor, carpet);
            System.out.println("Total : " + calculator.getTotalCost());

            System.out.println("do you wish to continue enter Y/N : ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
    }
}