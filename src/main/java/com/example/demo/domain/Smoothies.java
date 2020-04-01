package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Smoothies {
    @Id
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private Fruits ingredient;
}
