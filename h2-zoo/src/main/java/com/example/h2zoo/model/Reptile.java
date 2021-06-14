package com.example.h2zoo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reptile {

    @Id
    @GeneratedValue
    private Long id;
    private final String name;
    private final String species;
    private final String color;
    private final String dietType;

    public Reptile(String name, String species, String color, String dietType)
    {
        this.name = name;
        this.species = species;
        this.color= color;
        this.dietType = dietType;

    }

}
