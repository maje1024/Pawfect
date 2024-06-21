package com.example.pawfect.database.mocks;

import com.example.pawfect.entities.AnimalProfile;
import com.example.pawfect.entities.Gender;
import com.example.pawfect.entities.Intent;

import java.util.ArrayList;
import java.util.List;

public abstract class AnimalProfileMock {

    private AnimalProfileMock() {}

    public static List<AnimalProfile> getAnimalProfiles() {
        List<AnimalProfile> animalProfileList= new ArrayList<>();

        AnimalProfile animal1 = new AnimalProfile(2001, 1001, "Bella", 3, Gender.FEMALE, "image1.jpg", "Hund", "Labrador", "Freundlich", 60.0, 25.0, Intent.PLAY, "Ein freundlicher Hund.");
        AnimalProfile animal2 = new AnimalProfile(2002, 1002, "Milo", 2, Gender.MALE, "image2.jpg", "Katze", "Siamese", "Verspielt", 30.0, 5.0, Intent.PLAY, "Eine verspielte Katze.");
        AnimalProfile animal3 = new AnimalProfile(2003, 1003, "Luna", 4, Gender.FEMALE, "image3.jpg", "Hund", "Golden Retriever", "Treue", 70.0, 30.0, Intent.MATE, "Ein treuer Hund.");
        AnimalProfile animal4 = new AnimalProfile(2004, 1004, "Charlie", 1, Gender.MALE, "image4.jpg", "Katze", "Persisch", "Ruhig", 35.0, 6.0, Intent.PLAY, "Eine ruhige Katze.");
        AnimalProfile animal5 = new AnimalProfile(2005, 1005, "Max", 2, Gender.MALE, "image5.jpg", "Hund", "Bulldogge", "Tapfer", 50.0, 20.0, Intent.MATE, "Ein tapferer Hund.");
        AnimalProfile animal6 = new AnimalProfile(2006, 1001, "Oliver", 3, Gender.MALE, "image6.jpg", "Katze", "Maine Coon", "Neugierig", 40.0, 7.0, Intent.PLAY, "Eine neugierige Katze.");
        AnimalProfile animal7 = new AnimalProfile(2007, 1002, "Daisy", 5, Gender.FEMALE, "image7.jpg", "Hund", "Beagle", "Energiegeladen", 45.0, 18.0, Intent.PLAY, "Ein energiegeladener Hund.");
        AnimalProfile animal8 = new AnimalProfile(2008, 1003, "Lucy", 4, Gender.FEMALE, "image8.jpg", "Katze", "Ragdoll", "Sanft", 35.0, 6.5, Intent.PLAY, "Eine sanfte Katze.");
        AnimalProfile animal9 = new AnimalProfile(2009, 1004, "Rocky", 1, Gender.MALE, "image9.jpg", "Hund", "Rottweiler", "Stark", 80.0, 35.0, Intent.MATE, "Ein starker Hund.");
        AnimalProfile animal10 = new AnimalProfile(2010,1005, "Molly", 2, Gender.FEMALE, "image10.jpg", "Katze", "Bengal", "Agil", 25.0, 4.5, Intent.PLAY, "Eine agile Katze.");

        animalProfileList.add(animal1);
        animalProfileList.add(animal2);
        animalProfileList.add(animal3);
        animalProfileList.add(animal4);
        animalProfileList.add(animal5);
        animalProfileList.add(animal6);
        animalProfileList.add(animal7);
        animalProfileList.add(animal8);
        animalProfileList.add(animal9);
        animalProfileList.add(animal10);



        return animalProfileList;
    }
}
