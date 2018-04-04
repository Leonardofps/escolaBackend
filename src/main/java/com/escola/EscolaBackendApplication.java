package com.escola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.escola.dto.Aluno;
import com.escola.repositories.AlunoRepository;

@SpringBootApplication
public class EscolaBackendApplication implements CommandLineRunner {
	@Autowired
	private AlunoRepository alunoRepository;
	public static void main(String[] args) {
		SpringApplication.run(EscolaBackendApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		alunoRepository.save(new Aluno("Leonardo", "Solteiro"));
	}
}
