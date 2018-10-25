package com.omnia.exercises.repository;

import com.omnia.exercises.model.entities.ExerciseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends BaseRepository<ExerciseEntity, Long> {
}
