package com.example.pawfect.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.pawfect.entities.Match;

import java.util.List;
import java.util.UUID;

@Dao
public interface MatchDao {

    @Query("SELECT * FROM matches WHERE matchId = :id LIMIT 1")
    LiveData<Match> findById(final int id);

    @Query("SELECT * FROM matches")
    LiveData<List<Match>> findAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void save(final Match match);

    @Query("DELETE FROM matches WHERE matchId = :id")
    void delete(final int id);
}
