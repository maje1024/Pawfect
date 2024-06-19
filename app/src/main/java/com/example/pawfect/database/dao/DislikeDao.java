package com.example.pawfect.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.pawfect.models.Dislike;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Dao
public interface DislikeDao {

    @Insert
    void insertDislike(Dislike dislike);

    @Query("SELECT * FROM dislikes")
    List<Dislike> getAllDislikes();

    @Query("SELECT * FROM dislikes WHERE dislikeId = :dislikeId")
    Dislike getDislikeById(UUID dislikeId);

    @Query("SELECT * FROM dislikes WHERE dislikerAnimalId = :dislikerAnimalId AND dislikeeAnimalId = :dislikeeAnimalId")
    Dislike getDislikeByDislikerAndDislikeeIds(UUID dislikerAnimalId, UUID dislikeeAnimalId);

    @Query("DELETE FROM dislikes WHERE dislikeId = :dislikeId")
    void deleteDislike(UUID dislikeId);
}
