package EmployeeList;

/**
 * Created by KsenCH on 18.03.2016.
 */
public class Person  implements Comparable<Person>{
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;


    public Person(String name, String surname, int age, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        switch (this.age = age) {
        }
        this.phoneNumber = phoneNumber;
    }




    @Override
    public int compareTo(Person e) {
        return surname.compareTo(e.surname);
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


