package com.example.demo.controller;

import com.example.demo.domain.Smoothies;
import com.example.demo.repository.SmoothiesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmoothiesController {
    private SmoothiesRepository smoothiesRepository;

    public SmoothiesController(SmoothiesRepository smoothiesRepository) {
        this.smoothiesRepository = smoothiesRepository;
    }

    @GetMapping("/smoothies")
    public Smoothies serveSmoothie(@PathVariable Long id) {
        return smoothiesRepository.findById(id).get();
    }
}
