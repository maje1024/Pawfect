package com.example.pawfect.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.pawfect.models.Like;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Dao
public interface LikeDao {

    @Insert
    void insertLike(Like like);

    @Query("SELECT * FROM likes")
    List<Like> getAllLikes();

    @Query("SELECT * FROM likes WHERE likeId = :likeId")
    Like getLikeById(UUID likeId);

    @Query("SELECT * FROM likes WHERE likerAnimalId = :likerAnimalId AND likeeAnimalId = :likeeAnimalId")
    Like getLikeByLikerAndLikeeIds(UUID likerAnimalId, UUID likeeAnimalId);

    @Query("DELETE FROM likes WHERE likeId = :likeId")
    void deleteLike(UUID likeId);

    // Weitere Methoden für spezifische Abfragen oder Operationen
}
