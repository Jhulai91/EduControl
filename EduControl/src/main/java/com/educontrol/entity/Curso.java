package com.educontrol.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="curso")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Curso {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_curso")
	private Integer idCurso;
	
	@ManyToOne
	@JoinColumn(name="id_materia", nullable = false)
	private Materia materia;
	
	@ManyToOne
	@JoinColumn(name="id_docente", nullable = false)
	private Docente docente;
	
	@ManyToOne
	@JoinColumn(name="id_periodo" , nullable = false)
	private Periodo periodo;
	
	@NotNull
	@Column(name = "curso_paralelo")
    private String cursoParalelo;
	
	@NotNull
	@Column(name = "curso_horario")
    private String cursoHorario;
	
	@NotNull
	@Column(name = "curso_cupo")
    private Integer cursoCupo;
	
	@NotNull
	@Column(name = "curso_estado")
    private String cursoEstado;
	
}
