package application.models;

public enum Rarity {

    COMMON,
    RARE,
    VERY_RARE,
    EPIC,
    LEGENDARY,
    HEROIC;

    public static Rarity find(String name) {
        for (Rarity rarity : Rarity.values()) {
            if (rarity.toString().equalsIgnoreCase(name)) {
                return rarity;
            }
        }
        return Rarity.COMMON;
    }
}
