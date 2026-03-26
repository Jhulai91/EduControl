package com.educontrol.service;

import java.util.List;

import com.educontrol.entity.Especializacion;


public interface EspecializacionService {

	Especializacion saveEspecializacion(Especializacion  especializacion);
	List<Especializacion> findAllEspecializacion();
	Especializacion updateEspecializacion(int id,Especializacion especializacion);
	void deleteEspecializacion (int id);
}
