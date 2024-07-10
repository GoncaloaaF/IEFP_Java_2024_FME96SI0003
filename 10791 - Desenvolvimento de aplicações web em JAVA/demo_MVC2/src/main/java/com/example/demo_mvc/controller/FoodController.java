package com.example.demo_mvc.controller;

import com.example.demo_mvc.dtos.FoodDto;
import com.example.demo_mvc.model.Food;
import com.example.demo_mvc.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

        // injeta na pagina uma lista de obj do tipo FoodDto
        model.addAttribute("foods", allFoods);
        return "menu";

    }


    @GetMapping("/add")
    public String addToMenuView(Model model) {
        Food food = new Food();
        // injeta na pagina um obj do tipo Food
        model.addAttribute("food", food);
        return "addtomenu";
    }


    @PostMapping("/add")
    public String addToMenu(@ModelAttribute("food") Food food) {

        Food f = this.foodService.save(food);

        if (f == null){
             return "redirect:/add";
        }
        return "redirect:/menu";
    }
}







