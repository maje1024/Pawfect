package com.example.pawfect.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.pawfect.entities.Dislike;
import com.example.pawfect.entities.Like;

import java.util.List;
import java.util.UUID;

@Dao
public interface LikeDao {

    @Query("SELECT * FROM like WHERE like_id = :id LIMIT 1")
    LiveData<Like> findById(final int id);

    @Query("SELECT * FROM  like")
    LiveData<List<Like>> findAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void save(final  Like  like);

    @Query("DELETE FROM  like WHERE like_id = :id")
    void delete(final int id);
}
