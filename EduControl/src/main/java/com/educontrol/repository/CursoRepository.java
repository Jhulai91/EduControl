package com.educontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educontrol.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
