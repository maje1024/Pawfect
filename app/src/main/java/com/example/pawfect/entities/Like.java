package com.example.pawfect.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;
import androidx.room.ColumnInfo;

@Entity(tableName = "likes")
public class Like {
    @ColumnInfo(name = "likeId")
    @PrimaryKey
    private int likeId;
    @ColumnInfo(name = "likerAnimalId")
    private int likerAnimalId;
    @ColumnInfo(name = "likeeAnimalId")
    private int likeeAnimalId;
    @ColumnInfo(name = "date")
    private Date date;

    public Like(
            int likeId,
            int likerAnimalId,
            int likeeAnimalId,
            Date date) {
        this.likeId = likeId;
        this.likerAnimalId = likerAnimalId;
        this.likeeAnimalId = likeeAnimalId;
        this.date = date;
    }

    // Getter und Setter
    public int getLikeId() { return likeId; }
    public void setLikeId(int likeId) { this.likeId = likeId; }
    public int getLikerAnimalId() { return likerAnimalId; }
    public void setLikerAnimalId(int likerAnimalId) { this.likerAnimalId = likerAnimalId; }
    public int getLikeeAnimalId() { return likeeAnimalId; }
    public void setLikeeAnimalId(int likeeAnimalId) { this.likeeAnimalId = likeeAnimalId; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    @Override
    public String toString() {
        return "Like{" +
                "likeId=" + likeId +
                ", likerAnimalId=" + likerAnimalId +
                ", likeeAnimalId=" + likeeAnimalId +
                ", date=" + date +
                '}';
    }
}
