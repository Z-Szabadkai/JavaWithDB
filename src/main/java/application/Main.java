package application;

import application.database.DBEngine;
import application.models.Dragon;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DBEngine engine = new DBEngine();

        if (engine.isConnected()) {
            Dragon dragon = engine.findByName("Angelus");
            System.out.println(dragon);
        } else {
            System.out.println("No connection");
        }
    }
}
