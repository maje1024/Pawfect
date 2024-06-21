package com.example.pawfect;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.example.pawfect.database.AppDatabase;
import com.example.pawfect.database.Pool;
import com.example.pawfect.database.mocks.AnimalProfileMock;
import com.example.pawfect.database.mocks.DislikeMock;
import com.example.pawfect.database.mocks.LikeMock;
import com.example.pawfect.database.mocks.MatchMock;
import com.example.pawfect.database.mocks.UserProfileMock;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.ExecutorService;

public class MainActivity extends AppCompatActivity {
    private AppDatabase datenbank;
    private final ExecutorService pool;

    public MainActivity() {
        pool = Pool.getThreadPool();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datenbank = AppDatabase.getDatabase(this);

        initializeDatabase();
    }

    @SuppressLint("NewApi")
    public void initializeDatabase() {
        pool.submit(() -> {
            AnimalProfileMock.getAnimalProfiles().forEach(animalProfile -> datenbank.animalProfileDao().save(animalProfile));
            DislikeMock.getDislikes().forEach(dislike -> datenbank.dislikeDao().save(dislike));
            LikeMock.getLikes().forEach(like -> datenbank.likeDao().save(like));
            MatchMock.getLikes().forEach(match -> datenbank.matchDao().save(match));
            UserProfileMock.getUserProfiles().forEach(userProfile -> datenbank.userProfileDao().save(userProfile));
        });
    }
}
