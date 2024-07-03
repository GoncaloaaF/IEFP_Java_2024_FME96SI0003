package com.example.demo_2jul.controllers;


import com.example.demo_2jul.dtos.AlunoDTO;
import com.example.demo_2jul.model.Aluno;
import com.example.demo_2jul.repos.AlunoRepo;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    AlunoRepo alunoRepo;

    @PostMapping("/alunos")
    public ResponseEntity<Aluno> salvarAluno(@RequestBody @Valid AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        BeanUtils.copyProperties(alunoDTO, aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoRepo.save(aluno));
    }


    @GetMapping("/alunos")
    public ResponseEntity<List<Aluno>> listarAlunos() {
        return ResponseEntity.ok(alunoRepo.findAll());
    }


    //findById


}
