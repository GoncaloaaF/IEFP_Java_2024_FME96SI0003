package com.example.demo_mvc.controller;

import com.example.demo_mvc.dtos.FoodDto;
import com.example.demo_mvc.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FoodController {



    FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }


    @GetMapping("/")
    public String index(Model model) {
        List<FoodDto> allFoods = foodService.findAllFoods();
        model.addAttribute("nome", "Gonçalo");
        model.addAttribute("foods", allFoods);
        return "home";

    }


}
