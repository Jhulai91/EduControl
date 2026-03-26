package com.educontrol.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educontrol.entity.Periodo;
import com.educontrol.entity.RolUsuario;
import com.educontrol.repository.PeriodoRepository;
import com.educontrol.repository.RolUsuarioRepository;
import com.educontrol.service.PeriodoService;
@Service
public class PeriodoServiceImpl implements PeriodoService {
	
	@Autowired
	private PeriodoRepository periodoRepository;

	@Override
	public Periodo savePeriodo(Periodo periodo) {
		// TODO Auto-generated method stub
		return periodoRepository.save(periodo);
	}

	@Override
	public List<Periodo> findAllPeriodo() {
		// TODO Auto-generated method stub
		return periodoRepository.findAll();
	}

	@Override
	public Periodo updatePeriodo(int id, Periodo periodo) {
		Periodo periodoExistente = periodoRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("periodo no encontrado"));
	
		periodoExistente.setPeriodoNombre(periodo.getPeriodoNombre());
		periodoExistente.setPeriodoFechaInicio(periodo.getPeriodoFechaInicio());
		periodoExistente.setPeriodoFechaFin(periodo.getPeriodoFechaFin());
		periodoExistente.setPeriodoEstado(periodo.getPeriodoEstado());
		
		return periodoRepository.save(periodoExistente);
	}

	@Override
	public void deletePeriodo(int id) {
		// TODO Auto-generated method stub
		periodoRepository.deleteById(id);
	}

	@Override
	public Periodo findById(Integer id) {
		// TODO Auto-generated method stub
		return periodoRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Periodo no encontrado"));
	}

	

}
