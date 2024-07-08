package com.example.demo_mvc.service;

import com.example.demo_mvc.dtos.FoodDto;

import java.util.List;

public interface FoodService {

    public List<FoodDto> findAllFoods();

}
