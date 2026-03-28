package com.educontrol.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_usuario", nullable = false, unique = true)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_especializacion", nullable = false)
    private Especializacion especializacion;

    @NotNull
    @Column(name = "docente_cedula", nullable = false, unique = true)
    private String docenteCedula;

    @NotNull
    @Column(name = "docente_nombres", nullable = false)
    private String docenteNombres;

    @NotNull
    @Column(name = "docente_apellidos", nullable = false)
    private String docenteApellidos;

    @NotNull
    @Column(name = "docente_telefono", nullable = false)
    private String docenteTelefono;

    @NotNull
    @Column(name = "docente_email", nullable = false)
    private String docenteEmail;

    @NotNull
    @Column(name = "docente_estado", nullable = false)
    private String docenteEstado;
}