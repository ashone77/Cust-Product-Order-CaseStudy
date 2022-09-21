package com.example.customermicroservice.repository;

import com.example.customermicroservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepostiory extends JpaRepository<Customer, Long> {
    Customer findByCustId(Long id);
}
