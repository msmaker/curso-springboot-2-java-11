package com.msmaker.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msmaker.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
