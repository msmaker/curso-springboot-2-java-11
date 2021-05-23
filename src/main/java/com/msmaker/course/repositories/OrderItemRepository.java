package com.msmaker.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msmaker.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
