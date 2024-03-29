package com.techelevator.crm;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;

public class Pet {

    private String name;
    private String species;
    private List <String> vaccinations = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String listVaccinations () {
        String vaccines = "";
        for (int i = 0; i < vaccinations.size(); i++) {
            if (vaccinations.size() - 1 == i) {
                vaccines += (vaccinations.get(i));
            } else {
                vaccines += (vaccinations.get(i));
                vaccines += ", ";
            }

        }
//        System.out.println(vaccines);
        return vaccines;
    }
}
