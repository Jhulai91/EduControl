package com.educontrol.service;

import java.util.List;

import com.educontrol.entity.RolUsuario;

public interface RolUsuarioService {

	RolUsuario saveRol(RolUsuario rolusuario);
	List<RolUsuario> findAllRolUsuario();
	RolUsuario updateRol(int id,RolUsuario rolusuario);
	void deleteRolUsuario (int id);
	
}
