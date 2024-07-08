package com.example.demo_mvc.dtos;


import lombok.Builder;
import lombok.Data;


import java.time.LocalDateTime;


@Data
@Builder
public class FoodDto {
    private long id;
    private String name;
    private double price;
    private String imageURL;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;


}
