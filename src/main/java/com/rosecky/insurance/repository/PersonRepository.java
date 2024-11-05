package com.rosecky.insurance.repository;

import com.rosecky.insurance.model.Person;

import java.util.List;

public interface PersonRepository {
    void save(Person person);
    List<Person> findAll();
}
