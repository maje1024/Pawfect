package com.example.pawfect.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.example.pawfect.database.dao.AnimalProfileDao;
import com.example.pawfect.database.dao.DislikeDao;
import com.example.pawfect.database.dao.LikeDao;
import com.example.pawfect.database.dao.MatchDao;
import com.example.pawfect.database.dao.UserProfileDao;
import com.example.pawfect.models.AnimalProfile;
import com.example.pawfect.models.Dislike;
import com.example.pawfect.models.Like;
import com.example.pawfect.models.Match;
import com.example.pawfect.models.UserProfile;
import com.example.pawfect.utils.UUIDConverter;

@Database(entities = {AnimalProfile.class, Dislike.class, Like.class, Match.class, UserProfile.class}, version = 1)
@TypeConverters({UUIDConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract AnimalProfileDao animalProfileDao();
    public abstract DislikeDao dislikeDao();
    public abstract LikeDao likeDao();
    public abstract MatchDao matchDao();
    public abstract UserProfileDao userProfileDao();
}
