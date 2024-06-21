package com.example.pawfect.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.pawfect.entities.Like;
import java.util.List;

@Dao
public interface LikeDao {

    @Query("SELECT * FROM likes WHERE likeId = :id LIMIT 1")
    LiveData<Like> findById(final int id);

    @Query("SELECT * FROM  likes")
    LiveData<List<Like>> findAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void save(final  Like  like);

    @Query("DELETE FROM  likes WHERE likeId = :id")
    void delete(final int id);
}
