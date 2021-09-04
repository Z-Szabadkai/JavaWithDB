package application;

import application.database.DBEngine;

public class Main {

    public static void main(String[] args) {
        DBEngine engine = new DBEngine();

        System.out.println(engine.isConnected());
    }
}
