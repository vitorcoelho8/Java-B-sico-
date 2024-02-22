package Program;

import entities.funcionario;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main (String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funcionario func = new funcionario();
        System.out.print("NAME: ");
        func.name = sc.nextLine();
        System.out.print("Gross salary: ");
        func.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        func.tax = sc.nextDouble();

        System.out.println("Employee: " + func);
        System.out.print("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        func.increaseSalary(percentage);
        System.out.print("Update data: " + func);














    }
}
