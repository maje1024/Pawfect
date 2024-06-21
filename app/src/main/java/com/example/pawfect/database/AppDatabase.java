package com.example.pawfect.database;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.pawfect.dao.AnimalProfileDao;
import com.example.pawfect.dao.DislikeDao;
import com.example.pawfect.dao.LikeDao;
import com.example.pawfect.dao.MatchDao;
import com.example.pawfect.dao.UserProfileDao;
import com.example.pawfect.entities.AnimalProfile;
import com.example.pawfect.entities.Dislike;
import com.example.pawfect.entities.Gender;
import com.example.pawfect.entities.Intent;
import com.example.pawfect.entities.Like;
import com.example.pawfect.entities.Match;
import com.example.pawfect.entities.UserProfile;
import com.example.pawfect.utils.EnumTypeConverter;
import com.example.pawfect.utils.UUIDConverter;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.Executors;

@Database(entities = {AnimalProfile.class, Dislike.class, Like.class, Match.class, UserProfile.class}, version = 1)
@TypeConverters({UUIDConverter.class, EnumTypeConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract AnimalProfileDao animalProfileDao();
    public abstract DislikeDao dislikeDao();
    public abstract LikeDao likeDao();
    public abstract MatchDao matchDao();
    public abstract UserProfileDao userProfileDao();

    private static volatile AppDatabase INSTANCE;

    public static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    AppDatabase.class, "pawfect_database")
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static final RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            Executors.newSingleThreadExecutor().execute(() -> {
                // Datenbank im Hintergrund bevölkern
                AppDatabase database = getInstance(null); // Datenbank initialisieren

                // Matches
                MatchDao matchDao = database.matchDao();
                Match match1 = new Match(UUID.randomUUID(), animal1.getAnimalId(), animal3.getAnimalId(), new Date());
                Match match2 = new Match(UUID.randomUUID(), animal5.getAnimalId(), animal7.getAnimalId(), new Date());
                Match match3 = new Match(UUID.randomUUID(), animal9.getAnimalId(), animal2.getAnimalId(), new Date());
                Match match4 = new Match(UUID.randomUUID(), animal4.getAnimalId(), animal6.getAnimalId(), new Date());
                Match match5 = new Match(UUID.randomUUID(), animal8.getAnimalId(), animal10.getAnimalId(), new Date());

                matchDao.insertMatch(match1);
                matchDao.insertMatch(match2);
                matchDao.insertMatch(match3);
                matchDao.insertMatch(match4);
                matchDao.insertMatch(match5);
            });
        }
    };
}
