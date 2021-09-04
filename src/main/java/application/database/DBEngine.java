package application.database;

import application.models.Dragon;
import application.models.Rarity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBEngine {

    private Connection connection;

    public DBEngine() {
        connection = connect();
    }

    public boolean isConnected() {
        return (connection != null);
    }

    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/dragonDB" +
                "?useUnicode=yes&CharacterEncoding=UTF-8";

        Properties properties = new Properties();
        properties.put("user", System.getenv("SQL_username"));
        properties.put("password", System.getenv("SQL_password"));

        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Dragon> listAllDragons() {
        String query = "SELECT * FROM dragon";
        List<Dragon> dragons = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // getXXX("column_name_in_DB")
                long id = resultSet.getLong("id"); // can be resultSet.getLong(1), but that gives back the fields from left to right
                String name = resultSet.getString("unique_name");
                String text = resultSet.getString("dragon_text");
                String rarityFromDB = resultSet.getString("rarity").toUpperCase();
                Rarity rarity = Rarity.valueOf(rarityFromDB);

                Dragon dragon = new Dragon(id, name, text, rarity);

                dragons.add(dragon);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dragons;
    }

}
