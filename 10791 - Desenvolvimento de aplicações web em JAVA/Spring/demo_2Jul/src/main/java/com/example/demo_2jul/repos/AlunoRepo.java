package com.example.demo_2jul.repos;

import com.example.demo_2jul.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlunoRepo extends JpaRepository<Aluno, UUID> {

}
