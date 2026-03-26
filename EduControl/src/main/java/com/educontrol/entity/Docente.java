package com.educontrol.entity;

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
@Table(name="docente")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Docente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_docente")
	private Integer idDocente;
	
	@OneToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="id_especializacion", nullable = false)
	private Especializacion especializacion;
	
	@NotNull
	@Column(name = "docente_cedula")
    private String docenteCedula;
	
	@NotNull
	@Column(name = "docente_nombres")
    private String docenteNombres;
	
	@NotNull
	@Column(name = "docente_apellidos")
    private String docenteApellidos;
	
	@NotNull
	@Column(name = "docente_telefono")
    private String docenteTelefono;
	
	@NotNull
	@Column(name = "docente_email")
    private String docenteEmail;
	
	@NotNull
	@Column(name = "docente_estado")
    private String docenteEstado;

}
