package application.models;

public class Dragon {

    private long id;
    private String uniqueName;
    private String dragonText;
    private Rarity rarity;
    private byte[] design;

    public Dragon(long id, String uniqueName, String dragonText, Rarity rarity) {
        this.id = id;
        this.uniqueName = uniqueName;
        this.dragonText = dragonText;
        this.rarity = rarity;
    }
}
