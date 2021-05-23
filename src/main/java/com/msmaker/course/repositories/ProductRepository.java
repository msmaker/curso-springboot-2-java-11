package com.msmaker.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msmaker.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
