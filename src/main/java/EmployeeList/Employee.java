/**
 * Created by Ksenya on 08.12.2015.
 */

package EmployeeList;


public class Employee extends Person {

    private Manager manager;

    public Employee(String name, String surname, int age, String phoneNumber, Object o) {
        super(name, surname, age, phoneNumber);
    }


    @Override
    public String toString() {


        String text = "Employee:";
        text += " |Name: " + super.getName();
       text += " |Surname: " + super.getSurname();
        text += " |phoneNumber: " + super.getPhoneNumber();
        text += " |birthYear: " + super.getAge();
        if (this.manager != null)

            text += " [Manager: " + this.manager.toString();
        return text;

    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}




