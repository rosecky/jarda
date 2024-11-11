package com.vybostok.insurance.repositoryimplementation;

import com.vybostok.insurance.model.Person;
import com.vybostok.insurance.repository.PersonRepository;

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
