package com.example.pawfect.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "dislike")
public class Dislike {
    @ColumnInfo(name = "dislikeId")
    @PrimaryKey
    private int dislikeId;
    @ColumnInfo(name = "dislikerAnimalId")
    private int dislikerAnimalId;
    @ColumnInfo(name = "dislikeeAnimalId")
    private int dislikeeAnimalId;
    @ColumnInfo(name = "date")
    private Date date;

    public Dislike() {}

    public Dislike(
            int dislikeId,
            int dislikerAnimalId,
            int dislikeeAnimalId,
            Date date) {
        this.dislikeId = dislikeId;
        this.dislikerAnimalId = dislikerAnimalId;
        this.dislikeeAnimalId = dislikeeAnimalId;
        this.date = date;
    }
    
    // Getter und Setter
    public int getDislikeId() { return dislikeId; }
    public void setDislikeId(int dislikeId) { this.dislikeId = dislikeId; }
    public int getDislikerAnimalId() { return dislikerAnimalId; }
    public void setDislikerAnimalId(int dislikerAnimalId) { this.dislikerAnimalId = dislikerAnimalId; }
    public int getDislikeeAnimalId() { return dislikeeAnimalId; }
    public void setDislikeeAnimalId(int dislikeeAnimalId) { this.dislikeeAnimalId = dislikeeAnimalId; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    @Override
    public String toString() {
        return "Dislike{" +
                "dislikeId=" + dislikeId +
                ", dislikerAnimalId=" + dislikerAnimalId +
                ", dislikeeAnimalId=" + dislikeeAnimalId +
                ", date=" + date +
                '}';
    }
}
