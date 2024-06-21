package com.example.pawfect.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.Date;

@Entity(tableName = "matches")
public class Match {

    @ColumnInfo(name = "matchId")
    @PrimaryKey
    private int matchId;

    @ColumnInfo(name = "animal1Id")
    private int animal1Id;

    @ColumnInfo(name = "animal2Id")
    private int animal2Id;

    @ColumnInfo(name = "datum")
    private Date datum;

    // Getter und Setter
    public int getMatchId() { return matchId; }
    public void setMatchId(int matchId) { this.matchId = matchId; }
    public int getAnimal1Id() { return animal1Id; }
    public void setAnimal1Id(int animal1Id) { this.animal1Id = animal1Id; }
    public int getAnimal2Id() { return animal2Id; }
    public void setAnimal2Id(int animal2Id) { this.animal2Id = animal2Id; }
    public Date getDate() { return datum; }
    public void setDate(Date datum) { this.datum = datum; }

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", animal1Id=" + animal1Id +
                ", animal2Id=" + animal2Id +
                ", datum=" + datum +
                '}';
    }
}
