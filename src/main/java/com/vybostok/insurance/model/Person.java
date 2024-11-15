package com.vybostok.insurance.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Getter
@RequiredArgsConstructor
public class Person {
    private final int id;
    @NonNull
    private final String name;
    private final Set<Insurance> insurances = new HashSet<>();

    public void addInsurance(Insurance insurance) {
        insurances.add(insurance);
    }

    public void removeInsurance(Insurance insurance) {
        // TODO implement
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Person person
                && id == person.id;
    }
}
