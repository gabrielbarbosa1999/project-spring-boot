package dev.gabrielbarbosa.curso.services;

import dev.gabrielbarbosa.curso.entities.Category;
import dev.gabrielbarbosa.curso.entities.Order;
import dev.gabrielbarbosa.curso.repositories.CategoryRepository;
import dev.gabrielbarbosa.curso.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
