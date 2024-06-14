import java.util.Date;
import java.util.UUID;

// Dislikes
public class Dislike {
    private UUID dislikeId;
    private UUID dislikerAnimalId;
    private UUID dislikeeAnimalId;
    private Date date;

    // Getter und Setter
    public UUID getDislikeId() { return dislikeId; }
    public void setDislikeId(UUID dislikeId) { this.dislikeId = dislikeId; }
    public UUID getDislikerAnimalId() { return dislikerAnimalId; }
    public void setDislikerAnimalId(UUID dislikerAnimalId) { this.dislikerAnimalId = dislikerAnimalId; }
    public UUID getDislikeeAnimalId() { return dislikeeAnimalId; }
    public void setDislikeeAnimalId(UUID dislikeeAnimalId) { this.dislikeeAnimalId = dislikeeAnimalId; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}