package com.escola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escola.dto.Aluno;
import com.escola.repositories.AlunoRepository;

@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/api")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping("/alunos")
	public List<Aluno> getAlunos(){
		return alunoRepository.findAll();
	}
	
	@PostMapping("/aluno")
	public Aluno criarAluno(Aluno aluno){
		return alunoRepository.save(aluno);
	}
	
	@PutMapping("/aluno")
	public Aluno atualizarAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
}
