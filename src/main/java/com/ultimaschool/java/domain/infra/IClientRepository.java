package com.ultimaschool.java.domain.infra;

import com.ultimaschool.java.domain.entities.Client;

import java.sql.SQLException;
import java.util.List;

public interface IClientRepository {

    List<Client> findAll() throws SQLException;

    Client findByCpf(String cpf) throws SQLException;
    Client findById(int id) throws SQLException;

    boolean insert(Client client)  throws SQLException;

    boolean delete(int id) throws SQLException;

    boolean update(Client toUpdate) throws SQLException;

}
