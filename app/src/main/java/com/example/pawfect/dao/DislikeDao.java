package com.example.pawfect.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.pawfect.entities.AnimalProfile;
import com.example.pawfect.entities.Dislike;

import java.util.List;
import java.util.UUID;

@Dao
public interface DislikeDao {

    @Query("SELECT * FROM dislike WHERE dislike_id = :id LIMIT 1")
    LiveData<Dislike> findById(final int id);

    @Query("SELECT * FROM  dislike")
    LiveData<List<Dislike>> findAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void save(final  Dislike  dislike);

    @Query("DELETE FROM  dislike WHERE dislike_id = :id")
    void delete(final int id);
}
