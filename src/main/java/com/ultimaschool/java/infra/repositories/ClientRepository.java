package com.ultimaschool.java.infra.repositories;

import com.ultimaschool.java.domain.entities.Client;
import com.ultimaschool.java.domain.infra.IClientRepository;
import com.ultimaschool.java.infra.config.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository implements IClientRepository {

    private DatabaseConnection connection;

    public ClientRepository() {
        this.connection = DatabaseConnection.getInstance();
    }

    public List<Client> findAll() throws SQLException {
        ArrayList<Client> clients = new ArrayList<>();

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

    @Override
    public Client findByCpf(String cpf) throws SQLException {

        PreparedStatement preparedStatement = this.connection
                .getConnection()
                .prepareStatement("SELECT * FROM client WHERE cpf = ?");

        preparedStatement.setString(1, cpf);
        ResultSet resultSet = preparedStatement.executeQuery();

        boolean hasValues = resultSet.next();

        if (hasValues) {
            Client client = new Client();
            client.setId(resultSet.getInt("id"));
            client.setFirstName(resultSet.getString("first_name"));
            client.setLastName(resultSet.getString("last_name"));
            client.setEmail(resultSet.getString("email"));
            client.setCpf(resultSet.getString("cpf"));
            client.setAge(resultSet.getInt("age"));

            return client;
        }
        return null;
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

    public boolean insert(Client client) throws SQLException {
        boolean inserted;

        String insertSql = "insert into client (first_name, last_name, email, cpf, age)" +
                "values (?,?,?,?,?) ";

        PreparedStatement preparedStatement = this.connection
                .getConnection()
                .prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, client.getFirstName());
        preparedStatement.setString(2, client.getLastName());
        preparedStatement.setString(3, client.getEmail());
        preparedStatement.setString(4, client.getCpf());
        preparedStatement.setInt(5, client.getAge());

        inserted = preparedStatement.execute();

        ResultSet rs = preparedStatement.getGeneratedKeys();

        rs.next();

        client.setId(rs.getInt(1));

        return inserted;
    }

    public boolean update(Client client) throws SQLException {
        boolean updated = false;

        if (client == null || client.getId() <= 0) {
            return false;
        }

        String updateSql = "UPDATE client" +
                "SET first_name = ?," +
                "last_name = ?," +
                "email = ?," +
                "cpf = ?," +
                "age = ?" +
                "WHERE id = ?";

        PreparedStatement preparedStatement = this.connection
                .getConnection()
                .prepareStatement(updateSql);

        preparedStatement.setString(1, client.getFirstName());
        preparedStatement.setString(2, client.getLastName());
        preparedStatement.setString(3, client.getEmail());
        preparedStatement.setString(4, client.getCpf());
        preparedStatement.setInt(5, client.getAge());
        preparedStatement.setInt(6, client.getId());

        updated = preparedStatement.execute();

        return updated;
    }



    public boolean delete(int id) throws SQLException {
        boolean isDeleted = false;

        PreparedStatement preparedStatement = this.connection
                .getConnection()
                .prepareStatement("DELETE FROM client WHERE id = ?");

        preparedStatement.setInt(1, id);

        isDeleted = preparedStatement.execute();

        return isDeleted;
    }

}
