package com.educontrol.service;

import java.util.List;

import com.educontrol.entity.Docente;
import com.educontrol.entity.Usuario;


public interface DocenteService {

	Docente saveDocente(Docente  docente);
	List<Docente> findAllDocente();
	Docente updateDocente(int id,Docente docente);
	void deleteDocente (int id);
	void crearDocenteUsuairo(Usuario user, Docente docente);
}
