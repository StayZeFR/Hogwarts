package fr.stayze.database;

import fr.stayze.HogwartsConfig;
import fr.stayze.utils.ResourceLoader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static Connection database;

    public Database() {
        database = null;
        try {
            Class.forName("org.sqlite.JDBC");
            database = DriverManager.getConnection("jdbc:sqlite:" + HogwartsConfig.DATABASE_PATH);
            System.out.println("Opened database successfully");
            init();
        } catch ( ClassNotFoundException e ) {
            throw new RuntimeException("Could not load JDBC driver", e);
        } catch ( SQLException e ) {
            throw new RuntimeException("Could not connect to database", e);
        }
    }

    public void init() throws SQLException {
        String sql = ResourceLoader.loadFile("fr/stayze/database/hogwarts.sql");
        Statement statement = getConnection().createStatement();
        statement.executeUpdate(sql);
    }

    public static void connect() { new Database(); }
    public static void close() throws SQLException { database.close(); }
    public static Connection getConnection() { return database; }

}
