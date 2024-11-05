package com.rosecky.insurance.repositoryimplementation;

import com.rosecky.insurance.model.Person;
import com.rosecky.insurance.repository.PersonRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InMemoryPersonRepository implements PersonRepository {

    private final Set<Person> persons = new HashSet<>();

    @Override
    public void save(Person person) {
        persons.add(person);
    }

    @Override
    public List<Person> findAll() {
        return persons.stream().toList();
    }
}
