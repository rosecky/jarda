package com.vybostok.insurance.repository;

import com.vybostok.insurance.model.Person;

import java.util.List;

public interface PersonRepository {
    void save(Person person);
    List<Person> findAll();
}
