package com.example.pawfect.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;
import androidx.room.ColumnInfo;

@Entity(tableName = "user_profiles")
public class UserProfile {
    @ColumnInfo(name = "userProfileId")
    @PrimaryKey
    private int userProfileId;
    @ColumnInfo(name = "firstName")
    private String firstName;
    @ColumnInfo(name = "lastName")
    private String lastName;
    @ColumnInfo(name = "birthDate")
    private Date birthDate;
    @ColumnInfo(name = "email")
    private String email;
    @ColumnInfo(name = "password")
    private String password;
    @ColumnInfo(name = "isPremium")
    private boolean isPremium;
    @ColumnInfo(name = "swipesLeft")
    private int swipesLeft;
    @ColumnInfo(name = "address")
    private String address;

    public UserProfile(
            int userProfilId,
            String firstName,
            String lastName,
            Date birthDate,
            String email,
            String password,
            boolean isPremium,
            int swipesLeft,
            String address) {
        this.userProfileId = userProfilId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.isPremium = isPremium;
        this.swipesLeft = swipesLeft;
        this.address = address;
    }

    // Getter und Setter
    public int getUserProfilId() { return userProfileId; }
    public void setUserProfilId(int userProfilId) { this.userProfileId = userProfilId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public boolean isPremium() { return isPremium; }
    public void setPremium(boolean premium) { isPremium = premium; }
    public int getSwipesLeft() { return swipesLeft; }
    public void setSwipesLeft(int swipesLeft) { this.swipesLeft = swipesLeft; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return "UserProfile{" +
                "userProfilId=" + userProfileId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isPremium=" + isPremium +
                ", swipesLeft=" + swipesLeft +
                ", address='" + address + '\'' +
                '}';
    }
}
