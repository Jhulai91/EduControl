package com.educontrol.service;

import java.util.List;

import com.educontrol.entity.Usuario;

public interface UsuarioService {
	
	List<Usuario> findAllUsuario();
	Usuario saveUsuario(Usuario usuario);
	void deleteUsuario(int id);
	Usuario updateUsuario(int id, Usuario usuario);
	Usuario login(String usuario_nick, String usuario_password);

}
