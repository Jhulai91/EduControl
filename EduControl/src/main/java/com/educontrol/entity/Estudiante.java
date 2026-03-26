package com.educontrol.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="estudiante")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Estudiante {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_estudiante")
	private Integer idEstudiante;
	
	@ManyToOne
	@JoinColumn(name="id_usuario",nullable = false)
	private Usuario usuario;
	
	@NotNull
	@Column(name = "estudiante_cedula")
    private String estudianteCedula;
	
	@NotNull
	@Column(name = "estudiante_nombres")
    private String estudianteNombres;
	
	@NotNull
	@Column(name = "estudiante_apellidos")
    private String estudianteApellidos;
	
	@NotNull
	@Column(name = "estudiante_telefono")
    private String estudianteTelefono;
	
	@NotNull
	@Column(name = "estudiante_email")
    private String estudianteEmail;
	
	@NotNull
	@Column(name="estudiante_fecha_nac",nullable = false)
	
    private LocalDate estudianteFechaNac;
	
	@NotNull
	@Column(name = "estudiante_estado")
    private String estudianteEstado;
	
}
