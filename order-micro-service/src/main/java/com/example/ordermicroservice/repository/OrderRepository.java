package com.example.ordermicroservice.repository;

import com.example.ordermicroservice.entity.OrderOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderOne, Long> {
    OrderOne findByOrdId(Long id);
}
