package com.educontrol.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="matricula",
uniqueConstraints = @UniqueConstraint(columnNames = {"id_estudiante", "id_curso"}))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matricula {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_matricula")
	private Integer idMatricula;
	
	@ManyToOne
	@JoinColumn(name="id_estudiante", nullable=false)
	private Estudiante idEstudiante;
	
	@ManyToOne
	@JoinColumn(name="id_curso", nullable=false)
	private Curso idCurso;
	
	@NotNull
	@Column(name="matricula_fecha",nullable = false)
    private LocalDate matriculaFecha;
	
	@NotNull
	@Column(name="matricula_estado",nullable = false)
    private String matriculaEstado;
	
}
