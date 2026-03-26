package com.educontrol.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educontrol.entity.Matricula;
import com.educontrol.entity.Periodo;
import com.educontrol.repository.MatriculaRepository;
import com.educontrol.service.MatriculaService;
@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	MatriculaRepository matriculaRepository;
	
	@Override
	public Matricula saveMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		return matriculaRepository.save(matricula);
	}

	@Override
	public List<Matricula> findAllMtaricula() {
		// TODO Auto-generated method stub
		return matriculaRepository.findAll();
	}

	@Override
	public Matricula updateMatricula(int id, Matricula matricula) {
		Matricula matriculaExistente = matriculaRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("matricula no encontrado"));
	
		matriculaExistente.setMatriculaEstado(matricula.getMatriculaEstado());
		matriculaExistente.setMatriculaFecha(matricula.getMatriculaFecha());
		
		
		return matriculaRepository.save(matriculaExistente);
	}

	@Override
	public void deleteMatricula(int id) {
		// TODO Auto-generated method stub
		matriculaRepository.deleteById(id);
	}

}
