package com.joaopedroigeskimorais.course.repositories;

import com.joaopedroigeskimorais.course.entities.OrderItem;
import com.joaopedroigeskimorais.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
