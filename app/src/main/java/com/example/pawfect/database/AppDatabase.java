package com.example.pawfect.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.pawfect.dao.AnimalProfileDao;
import com.example.pawfect.dao.DislikeDao;
import com.example.pawfect.dao.LikeDao;
import com.example.pawfect.dao.MatchDao;
import com.example.pawfect.dao.UserProfileDao;
import com.example.pawfect.entities.AnimalProfile;
import com.example.pawfect.entities.Dislike;
import com.example.pawfect.entities.Like;
import com.example.pawfect.entities.Match;
import com.example.pawfect.entities.UserProfile;

@Database(entities = {AnimalProfile.class, Dislike.class, Like.class, Match.class, UserProfile.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AnimalProfileDao animalProfileDao();
    public abstract DislikeDao dislikeDao();
    public abstract LikeDao likeDao();
    public abstract MatchDao matchDao();
    public abstract UserProfileDao userProfileDao();

    private static AppDatabase INSTANCE;

    public static AppDatabase getDatabase(final Context context) {
        synchronized (AppDatabase.class) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                        context.getApplicationContext(),
                        AppDatabase.class,
                        "pawfect_database").build();
            }
        }
        return INSTANCE;
    }
}
