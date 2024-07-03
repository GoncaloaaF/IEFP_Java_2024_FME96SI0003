package com.example.demo_2jul.dtos;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AlunoDTO(@NotBlank String nome, @NotNull int idade) {
}
