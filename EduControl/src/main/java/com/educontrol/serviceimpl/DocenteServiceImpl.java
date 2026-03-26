package com.educontrol.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educontrol.entity.Docente;
import com.educontrol.entity.Usuario;
import com.educontrol.repository.DocenteRepository;
import com.educontrol.repository.UsuarioRepository;
import com.educontrol.service.DocenteService;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	DocenteRepository docenteRepository;
	
	 @Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Docente saveDocente(Docente docente) {
		// TODO Auto-generated method stub
		return docenteRepository.save(docente);
	}

	@Override
	public List<Docente> findAllDocente() {
		// TODO Auto-generated method stub
		return docenteRepository.findAll();
	}

	@Override
	public Docente updateDocente(int id, Docente docente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDocente(int id) {
		// TODO Auto-generated method stub
		docenteRepository.deleteById(id);
	}

	@Override
	public void crearDocenteUsuairo(Usuario user, Docente docente) {
		// TODO Auto-generated method stub
		 docente.setUsuario(user);
	        user.setDocente(docente);

	        usuarioRepository.save(user);
	}

}
