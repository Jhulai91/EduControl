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

import com.educontrol.entity.Especializacion;
import com.educontrol.entity.Estudiante;
import com.educontrol.service.EspecializacionService;
import com.educontrol.service.EstudianteService;

@RestController
@RequestMapping("/especializacion")
public class EspecializacionController {

	@Autowired
	private EspecializacionService especializacionService;
	
	@PostMapping("/guardar")
	public Especializacion guardar(@RequestBody Especializacion especializacion) 
	{
		return especializacionService.saveEspecializacion(especializacion);
		
	
	}
	
	@GetMapping("/listar")
	public List<Especializacion> listar()
	{
		return especializacionService.findAllEspecializacion();
		
		
	}
	
	@PutMapping("/actualizar/{id}")
	public Especializacion actualizar(@PathVariable int id, @RequestBody Especializacion especializacion) {
	
		return especializacionService.updateEspecializacion(id, especializacion);
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		especializacionService.deleteEspecializacion(id);
		return "especializacion  eliminado correctamente";
		
		
	}
	
}
