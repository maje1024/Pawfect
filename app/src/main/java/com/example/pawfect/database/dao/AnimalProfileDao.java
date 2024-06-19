package com.example.pawfect.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.example.pawfect.models.AnimalProfile;

import java.util.List;
import java.util.UUID;

@Dao
public interface AnimalProfileDao {
    @Query("SELECT * FROM animal_profiles")
    List<AnimalProfile> getAll();

    @Query("SELECT * FROM animal_profiles WHERE animalId = :id")
    AnimalProfile getById(UUID id);

    @Insert
    void insert(AnimalProfile animalProfile);

    @Update
    void update(AnimalProfile animalProfile);

    @Delete
    void delete(AnimalProfile animalProfile);
}
