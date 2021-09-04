package application;

import application.database.DBEngine;
import application.models.Dragon;
import application.models.Rarity;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DBEngine engine = new DBEngine();

        Dragon dragon = new Dragon("Zophiel", "Daemon Dragon", Rarity.HEROIC);
        boolean success = engine.addDragonToDB(dragon);

        if (engine.isConnected()) {
            List<Dragon> dragons = engine.listAllDragons();
            System.out.println(dragons);
        } else {
            System.out.println("No connection");
        }


    }
}
