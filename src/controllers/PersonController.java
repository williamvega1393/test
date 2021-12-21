package controllers;

import models.PersonModel;

import java.util.ArrayList;

public class PersonController {
    private ArrayList<PersonModel> persons;

    public PersonController() {
        this.persons = new ArrayList<>();
        persons.add(new PersonModel("William", "Vega"));
        persons.add(new PersonModel("Juan", "Cely"));
        persons.add(new PersonModel("Laura", "Castro"));
    }

    public void delete(PersonModel personModel) {
        persons.removeIf(personModel1 -> personModel1.getFirstName().equalsIgnoreCase(personModel.getFirstName()));
    }

    public ArrayList<PersonModel> getPersons() {
        return persons;
    }
}
