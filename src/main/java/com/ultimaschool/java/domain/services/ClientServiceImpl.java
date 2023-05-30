package com.ultimaschool.java.domain.services;

import com.ultimaschool.java.domain.entities.Client;
import com.ultimaschool.java.domain.infra.IClientRepository;
import com.ultimaschool.java.infra.repositories.ClientRepository;
import com.ultimaschool.java.shared.exceptions.BusinessException;

import java.sql.SQLException;

public class ClientServiceImpl implements IClientService{

    private IClientRepository clientRepository;

    public ClientServiceImpl() {
        this.clientRepository = new ClientRepository();
    }

    @Override
    public Client clientRegister(String name, String cpf, String email, int age) {
        Client client = null;
        if (cpf != null) {
            try {
                Client clientWithCpf = this.clientRepository.findByCpf(cpf);
                if (clientWithCpf != null) {
                    throw new BusinessException("Client already registered!");
                }
                String firstName = name;
                String lastName = name;
                client = new Client(firstName, lastName, cpf, email, age);
                this.clientRepository.insert(client);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return client;
    }
}
