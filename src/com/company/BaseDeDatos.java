package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    static final String url = "jdbc:sqlite:database.db";

    static BaseDeDatos instance;
    static Connection connection;

    public static BaseDeDatos get(){
        if(instance == null){
            instance = new BaseDeDatos();

            try {
                connection = DriverManager.getConnection(url);
                createTables();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return instance;
    }

    void deleteTables(){
        try (Statement statement = connection.createStatement()) {
            statement.execute("DROP TABLE IF EXISTS nota");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void createTables(){
        try (Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS nota (nombre text, apellido text, telefono text, correo text, favorito BOOLEAN)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertNota(String nombre, String apellido, String telefono, String correo, boolean favorito) {
        String sql = "INSERT INTO nota(nombre,apellido,telefono,correo,favorito) VALUES(?,?,?,?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, telefono);
            preparedStatement.setString(4, correo);
            preparedStatement.setBoolean(5, favorito);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Nota> listaNota(){
        String sql = "SELECT * FROM nota";

        List<Nota> listaNota = new ArrayList<>();
        try (PreparedStatement preparedStatement  = connection.prepareStatement(sql)){

            ResultSet resultSet  = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String telefono = resultSet.getString("telefono");
                String correo = resultSet.getString("correo");
                Boolean favorito = resultSet.getBoolean("favorito");


                listaNota.add(new Nota(nombre, apellido, telefono, correo, favorito));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listaNota;
    }
}