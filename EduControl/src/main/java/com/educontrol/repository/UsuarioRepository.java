package com.educontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educontrol.entity.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
	
Usuario findByUsuarioNick(String  usuarioNick);
}
