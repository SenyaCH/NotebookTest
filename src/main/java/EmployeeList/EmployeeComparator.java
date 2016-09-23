package EmployeeList;

        import java.util.Comparator;

/**
 * Created by Ksenya on 22.12.2015.
 */
class personComparator implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        return (o1.getSurname()).compareTo(o2.getSurname());
    }

}