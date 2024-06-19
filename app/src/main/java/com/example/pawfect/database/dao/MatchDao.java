package com.example.pawfect.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.pawfect.models.Match;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Dao
public interface MatchDao {

    @Insert
    void insertMatch(Match match);

    @Query("SELECT * FROM matches")
    List<Match> getAllMatches();

    @Query("SELECT * FROM matches WHERE matchId = :matchId")
    Match getMatchById(UUID matchId);

    @Query("SELECT * FROM matches WHERE animal1Id = :animal1Id AND animal2Id = :animal2Id")
    Match getMatchByAnimalIds(UUID animal1Id, UUID animal2Id);

    @Query("DELETE FROM matches WHERE matchId = :matchId")
    void deleteMatch(UUID matchId);

}
