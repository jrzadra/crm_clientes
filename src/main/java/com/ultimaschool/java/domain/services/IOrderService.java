package com.ultimaschool.java.domain.services;

import com.ultimaschool.java.domain.entities.Order;

public interface IOrderService {

    Order createOrder(String clientCpf);
}
