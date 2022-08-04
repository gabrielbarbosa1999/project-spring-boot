package dev.gabrielbarbosa.curso.repositories;

import dev.gabrielbarbosa.curso.entities.OrderItem;
import dev.gabrielbarbosa.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
