package com.educontrol.entity;

import jakarta.annotation.Nonnull;
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
@Table(name = "especializacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Especializacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_especializacion")
	private Integer idEspecializacion;

	@NotNull
	@Column(name = "especializacion_nombre")
    private String especializacionNombre;

	@NotNull
	@Column(name = "especializacion_estado")
    private String especializacionEstado;

}
