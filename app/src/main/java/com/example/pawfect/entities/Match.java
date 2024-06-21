package com.example.pawfect.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.example.pawfect.utils.UUIDConverter;

import java.util.Date;
import java.util.UUID;

@Entity(tableName = "matches")
public class Match {
    @PrimaryKey
    @TypeConverters(UUIDConverter.class)
    public UUID matchId;

    @TypeConverters(UUIDConverter.class)
    public UUID animal1Id;

    @TypeConverters(UUIDConverter.class)
    public UUID animal2Id;

    public Date datum;

    public Match(UUID matchId, UUID animal1Id, UUID animal2Id, Date datum) {
        this.matchId = matchId;
        this.animal1Id = animal1Id;
        this.animal2Id = animal2Id;
        this.datum = datum;
    }
}
