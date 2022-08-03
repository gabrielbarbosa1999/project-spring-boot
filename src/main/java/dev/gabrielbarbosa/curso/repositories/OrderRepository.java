package dev.gabrielbarbosa.curso.repositories;

import dev.gabrielbarbosa.curso.entities.Order;
import dev.gabrielbarbosa.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
