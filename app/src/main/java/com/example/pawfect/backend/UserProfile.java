package com.example.pawfect.backend;

import java.util.Date;
import java.util.UUID;

// Nutzerprofil
public class UserProfile {
    private UUID userId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;
    private String password;
    private boolean isPremium;
    private int swipesLeft;
    private String address;

    // Getter und Setter
    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }
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
}