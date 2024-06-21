package com.example.pawfect.entities;

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
    public UUID likeId;

    @TypeConverters(UUIDConverter.class)
    public UUID likerAnimalId;

    @TypeConverters(UUIDConverter.class)
    public UUID likeeAnimalId;

    public Date date;

    public Like(UUID likeId, UUID likerAnimalId, UUID likeeAnimalId, Date date) {
        this.likeId = likeId;
        this.likerAnimalId = likerAnimalId;
        this.likeeAnimalId = likeeAnimalId;
        this.date = date;
    }
}
