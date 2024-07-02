package com.example.demo_2jul.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "Alunos_SB")
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private int idade;
    private Double media;
    private Double media2;
    private int novoCampo;
     private int novoCampo2;

     @ManyToOne
     private Turma turma;


    public int getNovoCampo() {
        return novoCampo;
    }

    public void setNovoCampo(int novoCampo) {
        this.novoCampo = novoCampo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getMedia2() {
        return media2;
    }

    public void setMedia2(Double media2) {
        this.media2 = media2;
    }
}
