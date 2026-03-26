package com.educontrol.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educontrol.entity.Estudiante;
import com.educontrol.entity.Materia;
import com.educontrol.repository.EstudianteRepository;
import com.educontrol.repository.MateriaRepository;
import com.educontrol.service.EstudianteService;
@Service
public class EstudianteServiceImpl implements EstudianteService{

	@Autowired
	EstudianteRepository estudianteRepository;
	@Override
	public Estudiante saveEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return estudianteRepository.save(estudiante);
	}

	@Override
	public List<Estudiante> findAllEstudiante() {
		// TODO Auto-generated method stub
		return estudianteRepository.findAll();
	}

	@Override
	public Estudiante updateEstudiante(int id, Estudiante estudiante) {
		// TODO Auto-generated method stub
		Estudiante estudianteExistente = estudianteRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("estudiante no encontrado"));
	
		estudianteExistente.setEstudianteNombres(estudiante.getEstudianteNombres());
		estudianteExistente.setEstudianteApellidos(estudiante.getEstudianteApellidos());
		estudianteExistente.setEstudianteCedula(estudiante.getEstudianteCedula());
		estudianteExistente.setEstudianteEmail(estudiante.getEstudianteEmail());
		estudianteExistente.setEstudianteTelefono(estudiante.getEstudianteTelefono());
		estudianteExistente.setEstudianteFechaNac(estudiante.getEstudianteFechaNac());
		estudianteExistente.setEstudianteEstado(estudiante.getEstudianteEstado());
		return estudianteRepository.save(estudianteExistente);
	}

	@Override
	public void deleteEstudiante(int id) {
		// TODO Auto-generated method stub
		estudianteRepository.deleteById(id);
	}

}
