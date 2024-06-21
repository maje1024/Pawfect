package com.example.pawfect.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.example.pawfect.utils.EnumTypeConverter;
import com.example.pawfect.utils.UUIDConverter;

import java.util.UUID;

@Entity(tableName = "animal_profiles")
public class AnimalProfile {
    @PrimaryKey
    @TypeConverters(UUIDConverter.class)
    public int animalId;

    @TypeConverters(UUIDConverter.class)
    public int userId;

    public String name;
    public int age;
    @TypeConverters(EnumTypeConverter.class)
    public Gender gender;
    public String images;
    public String species;
    public String breed;
    public String characteristics;
    public double size;
    public double weight;
    @TypeConverters(EnumTypeConverter.class)
    public Intent intent;
    public String description;

    public AnimalProfile(UUID animalId, UUID userId, String name, int age, Gender gender, String images, String species, String breed, String characteristics, double size, double weight, Intent intent, String description) {
        this.animalId = animalId;
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.images = images;
        this.species = species;
        this.breed = breed;
        this.characteristics = characteristics;
        this.size = size;
        this.weight = weight;
        this.intent = intent;
        this.description = description;
    }

    public UUID getAnimalId() {
        return animalId;
    }
}
