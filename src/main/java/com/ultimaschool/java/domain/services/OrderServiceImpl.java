package com.ultimaschool.java.domain.services;

import com.ultimaschool.java.domain.entities.Client;
import com.ultimaschool.java.domain.entities.Order;
import com.ultimaschool.java.domain.infra.IClientRepository;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class OrderServiceImpl {

    private IClientRepository clientRepository;
    Order createOrder(String clientCpf) throws SQLException {
        Client client = clientRepository.findByCpf(clientCpf);
        client.getId();

        Order order = new Order();
        order.setCreatedDate(new Date());
        order.setClientId(client.getId());;
        order.setDeliveryDate(new Date());

        return null;
    }

    Order addProductToOrder(int orderId, int productId, int productAmount) {
        return null;
    }
}
