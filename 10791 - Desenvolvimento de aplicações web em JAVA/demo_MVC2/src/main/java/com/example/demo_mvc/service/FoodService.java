package com.example.demo_mvc.service;

import com.example.demo_mvc.dtos.FoodDto;
import com.example.demo_mvc.model.Food;

import java.util.List;

public interface FoodService {

    public List<FoodDto> findAllFoods();
    public Food save(Food f);

}
