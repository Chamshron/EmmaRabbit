package com.example.demo.repository;

import com.example.demo.models.Rabbit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RabbitRepository extends JpaRepository<Rabbit, Long> {
}