package com.example.pawfect.models;

import android.content.Intent;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.example.pawfect.utils.UUIDConverter;

import java.util.UUID;

@Entity(tableName = "animal_profiles")
public class AnimalProfile {
    @PrimaryKey
    @TypeConverters(UUIDConverter.class)
    private UUID animalId;

    @TypeConverters(UUIDConverter.class)
    private UserProfile userId;

    private String name;
    private int age;
    private Gender gender;
    private String images;
    private String species;
    private String breed;
    private String characteristics;
    private double size;
    private double weight;
    private Intent intent;
    private String description;

    // Getter und Setter
    public UUID getAnimalId() { return animalId; }
    public void setAnimalId(UUID animalId) { this.animalId = animalId; }
    public UserProfile getUserId() { return userId; }
    public void setUserId(UserProfile userId) { this.userId = userId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }
    public String getImages() { return images; }
    public void setImages(String images) { this.images = images; }
    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    public String getCharacteristics() { return characteristics; }
    public void setCharacteristics(String characteristics) { this.characteristics = characteristics; }
    public double getSize() { return size; }
    public void setSize(double size) { this.size = size; }
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
    public Intent getIntent() { return intent; }
    public void setIntent(Intent intent) { this.intent = intent; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}