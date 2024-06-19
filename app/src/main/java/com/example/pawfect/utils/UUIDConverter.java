package com.example.pawfect.utils;

import androidx.room.TypeConverter;
import java.util.UUID;

public class UUIDConverter {
    @TypeConverter
    public static UUID fromString(String value) {
        return value == null ? null : UUID.fromString(value);
    }

    @TypeConverter
    public static String uuidToString(UUID value) {
        return value == null ? null : value.toString();
    }
}
