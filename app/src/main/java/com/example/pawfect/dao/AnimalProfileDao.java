package com.example.pawfect.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.pawfect.entities.AnimalProfile;

import java.util.List;
import java.util.UUID;

@Dao
public interface AnimalProfileDao {

    @Query("SELECT * FROM animal_profiles WHERE animalProfileId = :id LIMIT 1")
    LiveData<AnimalProfile> findById(final int id);

    @Query("SELECT * FROM  animal_profiles")
    LiveData<List< AnimalProfile>> findAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void save(final  AnimalProfile  animalProfile);

    @Query("DELETE FROM  animal_profiles WHERE animalProfileId = :id")
    void delete(final int id);
}
