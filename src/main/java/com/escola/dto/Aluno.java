package com.escola.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno {
	@Id
	@GeneratedValue
	private Long matricula;
	private String nome;
	private String estadoCivil;
	
	public Aluno(String nome, String estadoCivil) {
		this.nome = nome;
		this.estadoCivil = estadoCivil;
	}
	
	public Aluno() {
		
	}
	
	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", estadoCivil=" + estadoCivil + "]";
	}
	
}
