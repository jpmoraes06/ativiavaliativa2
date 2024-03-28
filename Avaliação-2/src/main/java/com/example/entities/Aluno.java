package com.example.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "aluno")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cidade", nullable = false, length = 100)
	private String cidade;
	
	@Column(name = "email", nullable = false, length = 100)
	private String email;
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	@Column(name = "ra", nullable = false, length = 100)
	private String ra;
	
	@Column(name = "renda", nullable = false, length = 100)
	private BigDecimal renda;
	
	@Column(name = "telefone", nullable = false, length = 100)
	private String telefone;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "turma_id")
	private Turma turma;

}
