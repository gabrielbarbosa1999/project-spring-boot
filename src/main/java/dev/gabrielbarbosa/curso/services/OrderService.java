package dev.gabrielbarbosa.curso.services;

import dev.gabrielbarbosa.curso.entities.Order;
import dev.gabrielbarbosa.curso.entities.User;
import dev.gabrielbarbosa.curso.repositories.OrderRepository;
import dev.gabrielbarbosa.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
