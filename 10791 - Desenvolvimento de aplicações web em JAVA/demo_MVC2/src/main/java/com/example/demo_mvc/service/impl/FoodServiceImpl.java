package com.example.demo_mvc.service.impl;

import com.example.demo_mvc.dtos.FoodDto;
import com.example.demo_mvc.model.Food;
import com.example.demo_mvc.repos.FoodRepo;
import com.example.demo_mvc.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        /*

        // Versão mais expressiva:

        List<FoodDto> foodDtoList;

        foodDtoList = allFood.stream().map(this::convertFoodDto).collect(Collectors.toList());
        //  allFood.stream() <=> valor1 Valor2 valor3 valor4 .... valorN

        return foodDtoList;

         */

        return allFood.stream().map(this::convertFoodDto).collect(Collectors.toList());
    }


    private FoodDto convertFoodDto(Food food) {

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

private Food convertToFood(FoodDto foodDto) {

        return null;
}


    @Override
    public Food save(Food f) {

        if (f.getName().isEmpty()){
            return null;
        }
        return this.foodRepo.save(f);
    }
}
