package EmployeeList;

/**
 * Created by Ksenya on 14.12.2015.
 */

public class Manager extends Person{

    private String manager_id;

    private String department;


    public Manager(String name, String surname, int age, String phoneNumber, String department) {
        super(name, surname,age,phoneNumber);

        this.department = department;


    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {

        String textM = " ";
        textM += " Name: " + super.getName();
        textM += " Surname: " + super.getSurname();
        textM += " birthOfYear: " + super.getAge();
        textM += " phoneNumber: " + super.getPhoneNumber();
        textM += " Department: " + this.department;
        textM += "]\n";
        return textM;

    }


}


