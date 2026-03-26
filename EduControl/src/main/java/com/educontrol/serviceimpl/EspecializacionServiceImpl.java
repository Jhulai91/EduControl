package com.educontrol.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educontrol.entity.Especializacion;
import com.educontrol.repository.EspecializacionRepository;
import com.educontrol.repository.EstudianteRepository;
import com.educontrol.service.EspecializacionService;

@Service
public class EspecializacionServiceImpl implements EspecializacionService{

	@Autowired
	EspecializacionRepository especializacionRepository;
	
	@Override
	public Especializacion saveEspecializacion(Especializacion especializacion) {
		// TODO Auto-generated method stub
		return especializacionRepository.save(especializacion);
	}

	@Override
	public List<Especializacion> findAllEspecializacion() {
		// TODO Auto-generated method stub
		return especializacionRepository.findAll();
	}

	@Override
	public Especializacion updateEspecializacion(int id, Especializacion especializacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEspecializacion(int id) {
		// TODO Auto-generated method stub
		especializacionRepository.deleteById(id);
	}

}
