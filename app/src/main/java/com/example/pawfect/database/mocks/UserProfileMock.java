package com.example.pawfect.database.mocks;

import com.example.pawfect.entities.UserProfile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public abstract class UserProfileMock {

    private UserProfileMock() {}

    public static List<UserProfile> getUserProfiles() {
        List<UserProfile> userprofileList= new ArrayList<>();

        UserProfile user1 = new UserProfile(1001, "John", "Doe", new Date(), "john@example.com", "password123", true, 10, "123 Street");
        UserProfile user2 = new UserProfile(1002, "Jane", "Smith", new Date(), "jane@example.com", "password123", true, 10, "456 Avenue");
        UserProfile user3 = new UserProfile(1003, "Alice", "Johnson", new Date(), "alice@example.com", "password123", false, 10, "789 Boulevard");
        UserProfile user4 = new UserProfile(1004, "Bob", "Brown", new Date(), "bob@example.com", "password123", false, 10, "101 Street");
        UserProfile user5 = new UserProfile(1005, "Charlie", "Davis", new Date(), "charlie@example.com", "password123", true, 10, "202 Avenue");

        userprofileList.add(user1);
        userprofileList.add(user2);
        userprofileList.add(user3);
        userprofileList.add(user4);
        userprofileList.add(user5);


        return userprofileList;
    }
}
