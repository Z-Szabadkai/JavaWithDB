package application.models;

import java.util.List;

public class Dragon {

    private long id;
    private String uniqueName;
    private String dragonText;
    private Rarity rarity;
    private byte[] design;

    private List<Element> elements;

    public Dragon(long id, String uniqueName, String dragonText, Rarity rarity) {
        this.id = id;
        this.uniqueName = uniqueName;
        this.dragonText = dragonText;
        this.rarity = rarity;
    }
}
