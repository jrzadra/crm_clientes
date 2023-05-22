package com.ultimaschool.java.repository;

import com.ultimaschool.java.domain.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository {

    private DatabaseConnection connection;

    public ClientRepository() {
        this.connection = DatabaseConnection.getInstance();
    }

    public List<Client> findAll() throws SQLException {
        List<Client> clients = new ArrayList<>();

        PreparedStatement preparedStatement = this.connection
                .getConnection()
                .prepareStatement("SELECT * FROM client");

        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()) {
            Client client = new Client();
            client.setId(resultSet.getInt("id"));
            client.setFirstName(resultSet.getString("first_name"));
            client.setLastName(resultSet.getString("last_name"));
            client.setEmail(resultSet.getString("email"));
            client.setCpf(resultSet.getString("cpf"));
            client.setAge(resultSet.getInt("age"));
            clients.add(client);
        }

        return clients;
    }

    public Client findById(int id) throws SQLException {

        Client client = null;

        PreparedStatement preparedStatement = this.connection
                .getConnection()
                .prepareStatement("SELECT * FROM client WHERE id = ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            client = new Client();
            client.setId(resultSet.getInt("id"));
            client.setFirstName(resultSet.getString("first_name"));
            client.setLastName(resultSet.getString("last_name"));
            client.setEmail(resultSet.getString("email"));
            client.setCpf(resultSet.getString("cpf"));
            client.setAge(resultSet.getInt("age"));
        }
        return client;
    }
}