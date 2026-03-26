package com.educontrol.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
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
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer idUsuario;
	
	@ManyToOne
	@JoinColumn(name = "id_rol", nullable = false)
	private RolUsuario rolusuario;
	@NotNull
	@Column(name = "usuario_nick")
	private String usuarioNick;
   
	@NotNull
	@Column(name = "usuario_password")
    private String usuarioPassword;
	
	
	@NotNull
	@Column(name = "usuario_estado")
    private String usuarioEstado;
	
	@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnore
	private Docente docente;
}
