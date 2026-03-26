package com.educontrol.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="periodo_academico")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Periodo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_periodo")
	private Integer idPeriodo;
	
	@NotNull
	@Column(name = "periodo_nombre")
    private String periodoNombre;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="periodo_fecha_inicio",nullable = false)
    private LocalDate periodoFechaInicio;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="periodo_fecha_fin",nullable = false)
    private LocalDate periodoFechaFin;
	
	@NotNull
	@Column(name = "periodo_estado")
    private String periodoEstado;
}
