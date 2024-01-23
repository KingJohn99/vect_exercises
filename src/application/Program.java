package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;
import java.util.List;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        List<Employee> list = new ArrayList<>(); // Criando lista com classe Employee

        System.out.print(" How many Employees will be registred? ");
        int n = keyboard.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            int id = keyboard.nextInt();
            System.out.print("Name: ");
            keyboard.nextLine();
            String name = keyboard.nextLine();
            System.out.print("Salary: ");
            double salary = keyboard.nextDouble();

            Employee emp = new Employee(name, id, salary);
            list.add(emp);

        }
        Employee emp;
        do{

        System.out.print("Enter the employee id that will have salary increase : ");
        int y = keyboard.nextInt();
            emp = list.stream().filter(x -> x.getId() == y).findFirst().orElse(null); // checando se o id solicitado existe
            

        if (emp == null) {
            System.out.print("This id does not exist"); // se o id não existir, o sistema irá informar que o id não existe
            System.out.println();

        }
    }  while (emp == null); //repetir até inserir um id válido
    
        if (emp != null) {

            System.out.print("Enter the percentage: ");
            double percentage = keyboard.nextInt();
            emp.incraseSalary( percentage);
        }

        System.out.println("List of employees: ");

        for (Employee obj : list) {
            System.out.println(obj);
        }

        keyboard.close();

    
}

}
