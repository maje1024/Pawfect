package com.example.pawfect.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.example.pawfect.utils.UUIDConverter;

import java.util.Date;
import java.util.UUID;

@Entity(tableName = "user_profiles")
public class UserProfile {
    @PrimaryKey
    @TypeConverters(UUIDConverter.class)
    public int userId;

    public String firstName;
    public String lastName;
    public Date birthDate;
    public String email;
    public String password;
    public boolean isPremium;
    public int swipesLeft;
    public String address;

    public UserProfile(UUID userId, String firstName, String lastName, Date birthDate, String email, String password, boolean isPremium, int swipesLeft, String address) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.isPremium = isPremium;
        this.swipesLeft = swipesLeft;
        this.address = address;
    }

    public UUID getUserId() {
        return userId;
    }
}
