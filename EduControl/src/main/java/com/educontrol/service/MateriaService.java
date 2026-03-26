package com.educontrol.service;

import java.util.List;

import com.educontrol.entity.Materia;


public interface MateriaService {

	Materia saveMateria(Materia materia);
	List<Materia> findAllMateria();
	Materia updateMateria(int id,Materia materia);
	void deleteMateria (int id);
}
