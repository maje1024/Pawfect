package com.example.pawfect.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.example.pawfect.utils.UUIDConverter;

import java.util.Date;
import java.util.UUID;

@Entity(tableName = "dislikes")
public class Dislike {
    @PrimaryKey
    @TypeConverters(UUIDConverter.class)
    private UUID dislikeId;

    @TypeConverters(UUIDConverter.class)
    private UUID dislikerAnimalId;

    @TypeConverters(UUIDConverter.class)
    private UUID dislikeeAnimalId;

    private Date date;

    // Getter und Setter
    public UUID getDislikeId() { return dislikeId; }
    public void setDislikeId(UUID dislikeId) { this.dislikeId = dislikeId; }
    public UUID getDislikerAnimalId() { return dislikerAnimalId; }
    public void setDislikerAnimalId(UUID dislikerAnimalId) { this.dislikerAnimalId = dislikerAnimalId; }
    public UUID getDislikeeAnimalId() { return dislikeeAnimalId; }
    public void setDislikeeAnimalId(UUID dislikeeAnimalId) { this.dislikeeAnimalId = dislikeeAnimalId; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}
