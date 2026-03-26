package com.educontrol.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educontrol.entity.Curso;
import com.educontrol.repository.CursoRepository;
import com.educontrol.service.CursoService;


@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	
	CursoRepository cursoRepository;
	
	@Override
	public Curso saveCurso(Curso curso) {
		// TODO Auto-generated method stub
		return cursoRepository.save(curso);
	}

	@Override
	public List<Curso> findAllCurso() {
		// TODO Auto-generated method stub
		return cursoRepository.findAll();
	}

	@Override
	public Curso updateCurso(int id, Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCurso(int id) {
		// TODO Auto-generated method stub
		cursoRepository.deleteById(id);
	}

}
