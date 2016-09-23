
package EmployeeList;

import java.io.*;
import java.util.*;

/**
 * Created by Ksenya on 08.12.2015.
 */
public class Start {

   /* public void mainMenu(){


    }
*/





    public static final String FILE_PATH = "File.txt";


    public static void main(String[] args) throws IOException {


        List<Employee> employee = new ArrayList<>();
        List<Manager> manager = new ArrayList<>();

        Manager m1 = new Manager("olga", " Ivanova", 1983, "", "");
        Manager m2 = new Manager("anna", " Petrova", 1981, "", "");

        Employee e1 = new Employee("Ivan", "Ivanov", 1983, "48-22-22", m1);
        Employee e2 = new Employee("Alexey", "Alexeevich", 1982, "45-65-28", m2);
        Employee e3 = new Employee("Petr", "Petrov", 1981, "42-55-66", m1);

        employee.add(e1);
        employee.add(e2);
        employee.add(e3);

        manager.add(m1);
        manager.add(m2);


        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1.add\n2.delete\n3.show\n4.find\n5.add employee\n6.reading file\n7.exit");
        String str = "";



            try {

                str = in.readLine();
                if (str.equals("7")) {
                    System.out.print("Exit");
                    System.exit(0);
                }


            } catch (Exception e) {
                System.out.println("Error!!!" + e);
            }
            try {

                if (str.equals("1")) {
                    Menu.makeEmployee(employee, manager);// add new employee in list



                } else if (str.equals("2")) {             //delete
                    Menu.deleteEmployee(employee);


                } else if (str.equals("3")) {             //show employee
                    Menu.showEmployee(employee);


                } else if (str.equals("4")) {
                    Menu.findEmployee(employee);            //find employee

                } else if (str.equals("5")) {
                    Menu.listAdd(employee);

                } /*else if (str.equals("6")) {                     //read in file and add to list
                System.out.println("reading file:");
                try {
                    List<String> tempEmployee = new ArrayList<>();
                    Scanner sa = new Scanner(new File(FILE_PATH));
                    StringBuffer data = new StringBuffer();
                    String[] splited = null;
                    Employee temp = null;
                    while (sa.hasNext()) {
                        splited = sa.nextLine().split("\\s+");
                        temp = new Employee(manager);
                        temp.setName(splited[0]);
                        temp.setSurname(splited[1]);
                        temp.setAge(Integer.parseInt(splited[2]));
                        temp.setPhoneNumber(splited[3]);

                        tempEmployee.add(temp.toString());

                        data.append(sa.nextLine()).append("\n");
                        System.out.println(tempEmployee);
                    }
                    System.out.println(data.toString());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                try {

                    OutputStream f = new FileOutputStream("File.txt", true);
                    OutputStreamWriter writer = new OutputStreamWriter(f);
                    BufferedWriter out = new BufferedWriter(writer);
                    for (int i = 0; i < employee.size(); i++) {
                        out.write(String.valueOf(employee.get(i)));
                        out.flush();
                    }

                } catch (IOException ex) {
                    System.err.println(ex);

                }
            }*/


            } catch (Exception e) {
                e.printStackTrace();

            }



           /* Start nextMain = new Start();
            nextMain.main(args);
*/
        }

    }


