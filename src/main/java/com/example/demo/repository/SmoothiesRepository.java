package com.example.demo.repository;

import com.example.demo.domain.Smoothies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmoothiesRepository extends JpaRepository<Smoothies, Long> {
}
