package com.rosecky.insurance.controller;

import com.rosecky.insurance.model.Person;
import com.rosecky.insurance.repository.PersonRepository;
import com.rosecky.insurance.repositoryimplementation.InMemoryPersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonsController {

    private final PersonRepository personsRepository = new InMemoryPersonRepository();
    private int counter = 0;

    @GetMapping("/people")
    public List<Person> getPersons() {
        return personsRepository.findAll();
    }

    @PostMapping("/addPerson")
    public void addPerson(String name) {
        personsRepository.save(new Person(counter++, name));
    }
}
