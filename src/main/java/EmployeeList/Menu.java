package EmployeeList;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;



/**
 * Created by KsenCH on 13.01.2016.
 */
public class Menu {


    public static final String FILE_PATH = "File.txt";


        public static void makeEmployee (List < Employee > employee, List < Manager > manager){    //add new employee


        System.out.println("Add Employee \n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Name:|Surname:| birthYear:|Phone:| manager:");
        String name = sc.next();
        String surname = sc.next();
        int birthYear = sc.nextInt();
        if (birthYear <= 1900 && birthYear <= 2016) {
            System.out.println("Error!!!");

        } else {

            String phoneNumber = sc.next();
            System.out.println("Manager id:\n");
            String manager1 = sc.next();

            employee.add(new Employee(name, surname, birthYear, phoneNumber, null));

            System.out.println(employee + "\n");

        }

    }

    public static void sortEmployeeSurname(List<Employee> employee) {    //Sort by Surname
        Collections.sort(employee, new personComparator());
    }

    public static void showEmployee(List<Employee> employee) {      //Show Employee list
        System.out.println(" Sorted by:" + "\n" + "1. Surname");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();

        if (choice.equals("1")) {
            System.out.println("by Surname:");
            sortEmployeeSurname(employee);
            System.out.println(employee);


        }
    }

    public static void listAdd(List<Employee> employee) throws IOException {


    }


    public static void deleteEmployee(List<Employee> employee) {        //delete Employee
        System.out.println(" Delete ");
        System.out.println("Delete Employee (Index):\n");
        Scanner ac = new Scanner(System.in);
        int index = ac.nextInt();
        employee.remove(index);

        System.out.println("Employee has been deleted!" + employee);

    }


    public static void findEmployee(List<Employee> employee) {                //find employee
        System.out.println("\n Find by: 1.Surname +\n+2. BirthYear ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        if (choice.equals("1")) {
            System.out.println("Enter the name: ");
            String name = sc.next();
            System.out.println("Employee will be found by Surname: " + name);
            ListIterator litr = employee.listIterator();
            while (litr.hasNext()) {
                Employee empl = (Employee) litr.next();

                if (name.equals(empl.getName())) {
                    System.out.println("Employee has been found: " + "\"  " + empl.getName() + " "
                            + empl.getSurname());
                }
            }

        } else if (choice.equals("2")) {
            System.out.println("Employee will be found by Birth year: " + choice);
            System.out.println("Enter Birth year: ");
            String birthYear = sc.next();

            ListIterator litr = employee.listIterator();
            while (litr.hasNext()) {
                Employee empl = (Employee) litr.next();

                if (birthYear.equals(empl.getAge())) {
                    System.out.println("Employee has been found: " + "\"  " + empl.getName() + " "
                            + empl.getSurname());
                }
            }


    }
}

}

