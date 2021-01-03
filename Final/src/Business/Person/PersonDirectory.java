/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PersonDirectory {
    
    private ArrayList<Person> employeeList;

    public PersonDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Person> getPersonList() {
        return employeeList;
    }
    
    public Person createPerson(String name){
        Person employee = new Person();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}