package com.example.pawfect.models;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

@Entity(tableName = "animal_profile")
public class AnimalProfile {
    @ColumnInfo(name = "animalProfileId")
    @PrimaryKey
    private int animalProfileId;

    @ColumnInfo(name = "userProfileId")
    private int userProfileId;

    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "age")
    private int age;
    @ColumnInfo(name = "gender")
    private Gender gender;
    @ColumnInfo(name = "images")
    private String images;
    @ColumnInfo(name = "species")
    private String species;
    @ColumnInfo(name = "breed")
    private String breed;
    @ColumnInfo(name = "characteristics")
    private String characteristics;
    @ColumnInfo(name = "size")
    private double size;
    @ColumnInfo(name = "weight")
    private double weight;
    @ColumnInfo(name = "intent")
    private Intent intent;
    @ColumnInfo(name = "description")
    private String description;

    public AnimalProfile() {}

    public AnimalProfile(
            String name,
            int age,
            Gender gender,
            String images,
            String species,
            String breed,
            String characteristics,
            double size,
            double weight,
            Intent intent,
            String description) {
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

    // Getter und Setter
    public int getAnimalId() { return animalProfileId; }
    public void setAnimalId(int animalProfileId) { this.animalProfileId = animalProfileId; }
    public int getUserId() { return userProfileId; }
    public void setUserId(int userProfileId) { this.userProfileId = userProfileId; }
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

    @Override
    public String toString() {
        return "AnimalProfile{" +
                "animalProfileId=" + animalProfileId +
                ", userProfileId=" + userProfileId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", images='" + images + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", characteristics='" + characteristics + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                ", intent=" + intent +
                ", description='" + description + '\'' +
                '}';
    }
}
