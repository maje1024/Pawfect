package com.example.pawfect.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.example.pawfect.models.UserProfile;

import java.util.List;
import java.util.UUID;

@Dao
public interface UserProfileDao {

    @Insert
    void insertUserProfile(UserProfile userProfile);

    @Update
    void updateUserProfile(UserProfile userProfile);

    @Query("SELECT * FROM user_profiles")
    List<UserProfile> getAllUserProfiles();

    @Query("SELECT * FROM user_profiles WHERE userId = :userId")
    UserProfile getUserProfileById(UUID userId);

    @Query("DELETE FROM user_profiles WHERE userId = :userId")
    void deleteUserProfile(UUID userId);
}
