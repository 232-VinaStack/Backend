package com.demo.ViNaStack.Repositories;

import com.demo.ViNaStack.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepossitories extends JpaRepository<Product, Long> {
}
