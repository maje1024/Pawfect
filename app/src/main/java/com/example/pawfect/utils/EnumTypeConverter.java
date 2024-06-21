package com.example.pawfect.utils;

import androidx.room.TypeConverter;
import com.example.pawfect.entities.Gender;
import com.example.pawfect.entities.Intent;

public class EnumTypeConverter {

    @TypeConverter
    public static Gender fromGenderString(String gender) {
        return gender == null ? null : Gender.valueOf(gender);
    }

    @TypeConverter
    public static String genderToString(Gender gender) {
        return gender == null ? null : gender.name();
    }

    @TypeConverter
    public static Intent fromIntentString(String intent) {
        return intent == null ? null : Intent.valueOf(intent);
    }

    @TypeConverter
    public static String intentToString(Intent intent) {
        return intent == null ? null : intent.name();
    }
}
