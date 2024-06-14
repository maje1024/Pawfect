package com.example.pawfect.backend;

import java.util.Date;
import java.util.UUID;

// Likes
public class Like {
    private UUID likeId;
    private UUID likerAnimalId;
    private UUID likeeAnimalId;
    private Date date;

    // Getter und Setter
    public UUID getLikeId() { return likeId; }
    public void setLikeId(UUID likeId) { this.likeId = likeId; }
    public UUID getLikerAnimalId() { return likerAnimalId; }
    public void setLikerAnimalId(UUID likerAnimalId) { this.likerAnimalId = likerAnimalId; }
    public UUID getLikeeAnimalId() { return likeeAnimalId; }
    public void setLikeeAnimalId(UUID likeeAnimalId) { this.likeeAnimalId = likeeAnimalId; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}