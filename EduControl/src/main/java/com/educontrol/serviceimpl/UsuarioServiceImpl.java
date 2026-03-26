package com.educontrol.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.educontrol.entity.Usuario;

import com.educontrol.repository.UsuarioRepository;
import com.educontrol.service.UsuarioService;


@Service
public class UsuarioServiceImpl implements UsuarioService	{
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAllUsuario() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
		String passwordCifrada = passwordEncoder.encode(usuario.getUsuarioPassword());
		usuario.setUsuarioPassword(passwordCifrada);
		return usuarioRepository.save(usuario);
	}

	@Override
	public void deleteUsuario(int id) {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
	}

	@Override
	public Usuario updateUsuario(int id, Usuario usuario) {
		// TODO Auto-generated method stub
		
		Usuario usuarioExistente = usuarioRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Usuario no encontrado"));
		
		usuarioExistente.setUsuarioPassword(usuario.getUsuarioPassword());
		usuarioExistente.setUsuarioEstado(usuario.getUsuarioEstado());
		return usuarioRepository.save(usuarioExistente);
	}

	@Override
	public Usuario login(String usuarioNick, String usuarioPassword) {
		
		Usuario usuario = usuarioRepository.findByUsuarioNick(usuarioNick);

	    if (usuario != null && passwordEncoder.matches(usuarioPassword, usuario.getUsuarioPassword())) {
	        return usuario;
	    }

	    return null;
	}

}
