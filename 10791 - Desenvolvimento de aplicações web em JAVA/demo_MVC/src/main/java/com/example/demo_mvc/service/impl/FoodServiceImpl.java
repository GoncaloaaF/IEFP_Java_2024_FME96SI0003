package com.example.demo_mvc.service.impl;

import com.example.demo_mvc.dtos.FoodDto;
import com.example.demo_mvc.model.Food;
import com.example.demo_mvc.repos.FoodRepo;
import com.example.demo_mvc.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    FoodRepo foodRepo;

    @Autowired
    public FoodServiceImpl(FoodRepo foodRepo) {
        this.foodRepo = foodRepo;
    }

    @Override
    public List<FoodDto> findAllFoods() {
        List<Food> allFood = foodRepo.findAll();


        return List.of();
    }


    public FoodDto mapToFoodDto(Food food) {

        FoodDto foodDto = FoodDto.builder()
                .id(food.getId())
                .name(food.getName())
                .imageURL(food.getImageURL())
                .price(food.getPrice())
                .createTime(food.getCreateTime())
                .updateTime(food.getUpdateTime())
                .build();

        return foodDto;
    }




}
