package dev.gabrielbarbosa.curso.repositories;

import dev.gabrielbarbosa.curso.entities.Category;
import dev.gabrielbarbosa.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
