package com.educontrol.service;

import java.util.List;

import com.educontrol.entity.Matricula;
import com.educontrol.entity.Periodo;

public interface MatriculaService {

	Matricula saveMatricula(Matricula matricula);
	List<Matricula> findAllMtaricula();
	Matricula updateMatricula(int id,Matricula matricula);
	void deleteMatricula (int id);
}
