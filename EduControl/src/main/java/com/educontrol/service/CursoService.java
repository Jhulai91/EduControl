package com.educontrol.service;

import java.util.List;

import com.educontrol.entity.Curso;


public interface CursoService {

	Curso saveCurso(Curso  curso);
	List<Curso> findAllCurso();
	Curso updateCurso(int id,Curso curso);
	void deleteCurso (int id);
}
