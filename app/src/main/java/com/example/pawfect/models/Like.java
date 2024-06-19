package com.example.pawfect.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.example.pawfect.utils.UUIDConverter;

import java.util.Date;
import java.util.UUID;

@Entity(tableName = "likes")
public class Like {
    @PrimaryKey
    @TypeConverters(UUIDConverter.class)
    private UUID likeId;

    @TypeConverters(UUIDConverter.class)
    private UUID likerAnimalId;

    @TypeConverters(UUIDConverter.class)
    private UUID likeeAnimalId;

    private Date date;

    // Getter und Setter
    public UUID getLikeId() { return likeId; }
    public void setLikeId(UUID likeId) { this.likeId = likeId; }
    public UUID getLikerAnimalId() { return likerAnimalId; }
    public void setLikerAnimalId(UUID likerAnimalId) { this.likerAnimalId = likerAnimalId; }
    public UUID getLikeeAnimalId() { return likeeAnimalId; }
    public void setLikeeAnimalId(UUID likeeAnimalId) { this.likeeAnimalId = likeeAnimalId; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}
