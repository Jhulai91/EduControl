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
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="materia")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Materia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_materia")
	private Integer idMateria;
	
	@ManyToOne
	@JoinColumn(name="id_docente", nullable = false)
	private Docente idDocente;
	
	@NotNull
	@Column(name = "materia_nombre")
    private String materiaNombre;
	@NotNull
	@Column(name = "materia_credito")
    private String materiaCredito;
	@NotNull
	@Column(name = "materia_estado")
    private String materiaEstado;
}
