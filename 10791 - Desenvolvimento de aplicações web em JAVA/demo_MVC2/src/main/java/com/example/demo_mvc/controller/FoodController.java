package com.example.demo_mvc.controller;

import com.example.demo_mvc.dtos.FoodDto;
import com.example.demo_mvc.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String home(Model model) {
        model.addAttribute("info", "Home Page");
        return "home";

    }


    @GetMapping("/menu")
    public String menu(Model model) {
        List<FoodDto> allFoods = foodService.findAllFoods();
        model.addAttribute("nome", "Gonçalo");
        model.addAttribute("foods", allFoods);
        return "menu";

    }


    @GetMapping("/add")
    public String addToMenu(Model model) {
        model.addAttribute("info", "addtomenu");
        return "addtomenu";

    }

}
