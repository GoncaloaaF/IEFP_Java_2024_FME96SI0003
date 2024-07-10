package com.example.demo_mvc.repos;

import com.example.demo_mvc.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepo extends JpaRepository<Food, Long> {

    // Select * from Food where name = "name"
    public Food findByName(String name);
}
