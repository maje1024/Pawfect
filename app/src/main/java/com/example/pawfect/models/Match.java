package com.example.pawfect.models;

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
    private UUID matchId;

    @TypeConverters(UUIDConverter.class)
    private UUID animal1Id;

    @TypeConverters(UUIDConverter.class)
    private UUID animal2Id;

    private Date datum;

    // Getter und Setter
    public UUID getMatchId() { return matchId; }
    public void setMatchId(UUID matchId) { this.matchId = matchId; }
    public UUID getAnimal1Id() { return animal1Id; }
    public void setAnimal1Id(UUID animal1Id) { this.animal1Id = animal1Id; }
    public UUID getAnimal2Id() { return animal2Id; }
    public void setAnimal2Id(UUID animal2Id) { this.animal2Id = animal2Id; }
    public Date getDate() { return datum; }
    public void setDate(Date datum) { this.datum = datum; }
}
