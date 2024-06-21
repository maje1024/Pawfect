package com.example.pawfect.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.pawfect.entities.UserProfile;

import java.util.List;
import java.util.UUID;

@Dao
public interface UserProfileDao {

    @Query("SELECT * FROM user_profile WHERE userProfile_id = :id LIMIT 1")
    LiveData<UserProfile> findById(final int id);

    @Query("SELECT * FROM  user_profile")
    LiveData<List< UserProfile>> findAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void save(final  UserProfile  userProfile);

    @Query("DELETE FROM  user_profile WHERE userProfile_id = :id")
    void delete(final int id);
}
