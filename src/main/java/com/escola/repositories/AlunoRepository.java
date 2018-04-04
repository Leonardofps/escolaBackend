package com.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.dto.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
