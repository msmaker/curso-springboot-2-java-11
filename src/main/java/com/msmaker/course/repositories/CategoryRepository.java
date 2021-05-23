package com.msmaker.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msmaker.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
