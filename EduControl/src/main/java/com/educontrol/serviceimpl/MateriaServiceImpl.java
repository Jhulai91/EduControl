package com.educontrol.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educontrol.entity.Materia;
import com.educontrol.entity.Matricula;
import com.educontrol.repository.MateriaRepository;
import com.educontrol.repository.MatriculaRepository;
import com.educontrol.service.MateriaService;
@Service
public class MateriaServiceImpl implements MateriaService {

	@Autowired
	MateriaRepository materiaRepository;
	@Override
	public Materia saveMateria(Materia materia) {
		// TODO Auto-generated method stub
		return materiaRepository.save(materia);
	}

	@Override
	public List<Materia> findAllMateria() {
		// TODO Auto-generated method stub
		return materiaRepository.findAll();
	}

	@Override
	public Materia updateMateria(int id, Materia materia) {
		// TODO Auto-generated method stub
		Materia materiaExistente = materiaRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("materia no encontrado"));
	
		materiaExistente.setMateriaNombre(materia.getMateriaNombre());
		materiaExistente.setMateriaCredito(materia.getMateriaCredito());
		materiaExistente.setMateriaEstado(materia.getMateriaEstado());
		
		
		
		return materiaRepository.save(materiaExistente);
	}

	@Override
	public void deleteMateria(int id) {
		// TODO Auto-generated method stub
		materiaRepository.deleteById(id);
	}

}
