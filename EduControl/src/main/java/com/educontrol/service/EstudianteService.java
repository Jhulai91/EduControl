package com.educontrol.service;

import java.util.List;

import com.educontrol.entity.Estudiante;


public interface EstudianteService {

	Estudiante saveEstudiante(Estudiante estudiante);
	List<Estudiante> findAllEstudiante();
	Estudiante updateEstudiante(int id,Estudiante estudiante);
	void deleteEstudiante (int id);
}
