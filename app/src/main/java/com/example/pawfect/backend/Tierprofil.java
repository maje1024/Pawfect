import java.util.Date;
import java.util.UUID;

// Tierprofil
public class AnimalProfile {
    private UUID animalId;
    private UUID userId;
    private String name;
    private int age;
    private Gender gender;
    private String images;
    private String species;
    private String breed;
    private String characteristics;
    private double size;
    private double weight;
    private Intent intent;
    private String description;

    // Getter und Setter
    public UUID getAnimalId() { return animalId; }
    public void setAnimalId(UUID animalId) { this.animalId = animalId; }
    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }
    public String getImages() { return images; }
    public void setImages(String images) { this.images = images; }
    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    public String getCharacteristics() { return characteristics; }
    public void setCharacteristics(String characteristics) { this.characteristics = characteristics; }
    public double getSize() { return size; }
    public void setSize(double size) { this.size = size; }
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
    public Intent getIntent() { return intent; }
    public void setIntent(Intent intent) { this.intent = intent; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
