package com.example.demo.clothing;

import com.example.demo.Clothing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothingRepository extends JpaRepository<Clothing, Long> {
    //This gives you ready-made methods like save(), findAll(), findById(), and delete() to work with the Clothing table.
}