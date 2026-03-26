package com.educontrol.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educontrol.entity.RolUsuario;
import com.educontrol.repository.RolUsuarioRepository;
import com.educontrol.service.RolUsuarioService;
@Service
public class RolUsuarioServiceImpl implements	RolUsuarioService {

	@Autowired
	private RolUsuarioRepository repository;
	@Override
	public RolUsuario saveRol(RolUsuario rolusuario) {
		// TODO Auto-generated method stub
		return repository.save(rolusuario);
	}

	@Override
	public List<RolUsuario> findAllRolUsuario() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public RolUsuario updateRol(int id, RolUsuario rolusuario) {

		RolUsuario rolExistente = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Rol no encontrado"));
		
		rolExistente.setRolNombre(rolusuario.getRolNombre());
		rolExistente.setRolEstado(rolusuario.getRolEstado());
		return repository.save(rolExistente);
	}

	@Override
	public void deleteRolUsuario(int id) {
		// TODO Auto-generated method stub
		 repository.deleteById(id);
	}

}
