package application;

import application.database.DBEngine;
import application.models.Dragon;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DBEngine engine = new DBEngine();

        if (engine.isConnected()) {
            List<Dragon> dragons = engine.listAllDragons();
            System.out.println(dragons.toString());
        } else {
            System.out.println("No connection");
        }
    }
}
