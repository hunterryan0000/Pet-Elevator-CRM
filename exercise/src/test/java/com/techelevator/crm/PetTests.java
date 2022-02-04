package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

public class PetTests {
    Pet petTest;

    @Before
    public void testing_the_pet_class_method () {
        petTest = new Pet("Snoopy", "dog");

    }

    @Test
    public void testing_the_list_vaccinations_method() {
        petTest.getVaccinations().add("Rabies");
        petTest.getVaccinations().add("Distemper");
        petTest.getVaccinations().add("Parvo");
        Assert.assertEquals("Rabies, Distemper, Parvo", petTest.listVaccinations());


    }
}
