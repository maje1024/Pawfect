package com.example.pawfect.entities;

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
    public UUID dislikeId;

    @TypeConverters(UUIDConverter.class)
    public UUID dislikerAnimalId;

    @TypeConverters(UUIDConverter.class)
    public UUID dislikeeAnimalId;

    public Date date;

    public Dislike(UUID dislikeId, UUID dislikerAnimalId, UUID dislikeeAnimalId, Date date) {
        this.dislikeId = dislikeId;
        this.dislikerAnimalId = dislikerAnimalId;
        this.dislikeeAnimalId = dislikeeAnimalId;
        this.date = date;
    }
}
