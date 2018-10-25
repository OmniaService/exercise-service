package com.omnia.exercises.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExerciseEntity {

    @Id
    @GeneratedValue
    private Long id;

}
