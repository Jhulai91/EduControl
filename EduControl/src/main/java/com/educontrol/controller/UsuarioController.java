package com.educontrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educontrol.entity.RolUsuario;
import com.educontrol.entity.Usuario;

import com.educontrol.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/guardar")
	public Usuario guardar(@RequestBody Usuario usuario) 
	{
		return usuarioService.saveUsuario(usuario);
		
	
	}
	
	@GetMapping("/listar")
	public List<Usuario> listar()
	{
		return usuarioService.findAllUsuario();
		
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		usuarioService.deleteUsuario(id);
		return "Usuario eliminado correctamente";
		
		
	}
	
	@PutMapping("/actualizar/{id}")
	public Usuario actualizar(@PathVariable int id, @RequestBody Usuario usuario) {
	
		return usuarioService.updateUsuario(id, usuario);
		
	}
	
	
	
	
}
