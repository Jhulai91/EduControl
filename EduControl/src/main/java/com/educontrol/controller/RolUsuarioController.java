package com.educontrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educontrol.entity.RolUsuario;
import com.educontrol.service.RolUsuarioService;

@RestController
@RequestMapping("/rol")

public class RolUsuarioController {

	
	@Autowired
	private RolUsuarioService service;
	
	
	@PostMapping("/guardar")
	public RolUsuario guardar(@RequestBody RolUsuario rol) {
		return service.saveRol(rol);
		
		
	}
	
	@GetMapping("/listar")
	public List<RolUsuario> listar(){
		return service.findAllRolUsuario();
		
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		service.deleteRolUsuario(id);
		return "Rol eliminado correctamente";
		
		
	}
	
	@PutMapping("/actualizar/{id}")
	public RolUsuario actualizar(@PathVariable int id, @RequestBody RolUsuario rol) {
	
		return service.updateRol(id, rol);
		
	}
	
}
