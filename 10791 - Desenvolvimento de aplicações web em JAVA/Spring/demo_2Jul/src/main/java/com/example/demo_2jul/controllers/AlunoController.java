package com.example.demo_2jul.controllers;


import com.example.demo_2jul.dtos.AlunoDTO;
import com.example.demo_2jul.model.Aluno;
import com.example.demo_2jul.repos.AlunoRepo;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class AlunoController {

    @Autowired
    AlunoRepo alunoRepo;

    @PostMapping("/alunos")
    public ResponseEntity<Aluno> salvarAluno(@RequestBody @Valid AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        BeanUtils.copyProperties(alunoDTO, aluno);
        aluno.criarUsr();
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoRepo.save(aluno));
    }


    @GetMapping("/alunos")
    public ResponseEntity<List<Aluno>> listarAlunos() {
        return ResponseEntity.ok(alunoRepo.findAll());
    }


    //findById

        //devolve um Object e não um Aluno pq não posso grantir que não será pedido um aluno que não existe

    @GetMapping("/alunos/{id}")
    public ResponseEntity<Object> buscarAluno(@PathVariable UUID id) {

        Optional<Aluno> aluno = alunoRepo.findById(id); // é Optional pq o Aluno pode não existir

        if (aluno.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"msg\": \"o Aluno não Existe\",  \"erro\":" + HttpStatus.NOT_FOUND.value() +"}");
        }

        return ResponseEntity.ok(aluno.get());

    }

    //usar query param  <- challenge 1 - localhost:8080/alunos?id=.....


    //query  <- challenge 2

}
