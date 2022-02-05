package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Declaring a customer class > inheriting Person class
public class Customer extends Person implements Billable {

    // Adding Instance Variables
    // Syntax for the LIst:  Private List <Data Type> <Variable> = new ArrayList();
    private String phoneNumber;
    private List<Pet> pets = new ArrayList<>();


    // Establish constructors\
    // 2 constructors
    // 1 - Accepts 3 String parameters - first name, last name, and phone number
    // ----- Must set the phone # properly and call the base class constrrctor for first and last name

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        this.phoneNumber = "";

    }

    // Establish Getters and Setters
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double balance = 0;

        if (servicesRendered.containsKey("Grooming")) {
            balance = servicesRendered.get("Grooming");
        } else if (servicesRendered.containsKey("Walking")) {
            balance = servicesRendered.get("Walking");
        } else if (servicesRendered.containsKey("Sitting")) {
            balance = servicesRendered.get("Sitting");
        }
        return balance;
    }
}
