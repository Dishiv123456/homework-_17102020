package homeworkweekseven;

import java.util.Scanner;

public class GrossSalary {
    /* WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary  HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format  */
    public static void main(String[] args) {
        salary();
    }

    public static void salary() {
        int emp_Id;
        String name;
        double basicSalary, grossSalary, HRA, DA, TA, PF;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Employee Name : ");
        name = s.next();
        System.out.print("Enter Employee id : ");
        emp_Id = s.nextInt();
        System.out.print("Enter Basic salary : ");
        basicSalary = s.nextDouble();
        HRA = basicSalary * 0.1;
        DA = basicSalary * 0.08;
        TA = basicSalary * 0.09;
        PF = basicSalary * 0.2;
        grossSalary = (basicSalary + HRA + TA + DA);
        grossSalary = grossSalary - PF;
        System.out.println(grossSalary);
        /* _______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|  */
        System.out.println("_____________________________________");
        System.out.println("| Salary Slip                        |");
        System.out.println("|____________________________________|");
        System.out.println("|Employee Id   :"+emp_Id   +        "|");
        System.out.println("|Employee Name :"+name     +        "|");
        System.out.println("|____________________________________|");
        System.out.println("| Basic Salary :"+basicSalary +     "|");
        System.out.println("|HRA 10%       :"+HRA        +      "|");
        System.out.println("| TA 8%        :"+TA          +     "|");
        System.out.println("| DA 9%        :"+DA          +     "|");
        System.out.println("| PF -20 &     :"+PF          +     "|");
        System.out.println("|____________________________________|");
        System.out.println("|Gross salary   :"+grossSalary +    "|");
        System.out.println("|====================================|");
    }}