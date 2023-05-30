package com.ultimaschool.java.domain.services;

import com.ultimaschool.java.domain.entities.Client;

public interface IClientService {

    Client clientRegister(String name, String cpf, String email, int age);
}
