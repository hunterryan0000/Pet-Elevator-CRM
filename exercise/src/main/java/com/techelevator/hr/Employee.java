package com.techelevator.hr;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.Map;

public class Employee extends Person implements Billable {

    private int employeeId;
    private String title;
    private Department department;
    private double salary;

    public Employee(String firstName, String lastName) {
        this(firstName, lastName, "", 0);
    }

    public Employee(String firstName, String lastName, String title, double salary) {
        super(firstName,lastName);
        this.title = title;
        this.salary = salary;
    }

    @Override
    public String getFullName() {
        return this.getLastName() + ", " + this.getFirstName();
    }

    public void raiseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += salary * percentage / 100;
        }
    }

        @Override
        public double getBalanceDue(Map<String, Double> servicesRendered) {
            double balance = 0;

            if (servicesRendered.containsKey("Grooming")) {
                balance = servicesRendered.get("Grooming");
            } else if (servicesRendered.containsKey("Walking")) {
                balance = (servicesRendered.get("Walking")/2);
            } else if (servicesRendered.containsKey("Sitting")) {
                balance = servicesRendered.get("Sitting");
            }
            return balance;
        }




    // getters and setters

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
