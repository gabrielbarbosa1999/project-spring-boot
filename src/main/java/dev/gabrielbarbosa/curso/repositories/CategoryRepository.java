package dev.gabrielbarbosa.curso.repositories;

import dev.gabrielbarbosa.curso.entities.Category;
import dev.gabrielbarbosa.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
