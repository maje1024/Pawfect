import java.util.Date;
import java.util.UUID;

// Matches
public class Match {
    private UUID matchId;
    private UUID animal1Id;
    private UUID animal2Id;
    private Date date;

    // Getter und Setter
    public UUID getMatchId() { return matchId; }
    public void setMatchId(UUID matchId) { this.matchId = matchId; }
    public UUID getAnimal1Id() { return animal1Id; }
    public void setAnimal1Id(UUID animal1Id) { this.animal1Id = animal1Id; }
    public UUID getAnimal2Id() { return animal2Id; }
    public void setAnimal2Id(UUID animal2Id) { this.animal2Id = animal2Id; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}