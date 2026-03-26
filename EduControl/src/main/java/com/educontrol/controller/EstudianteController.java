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

import com.educontrol.entity.Estudiante;
import com.educontrol.entity.Materia;
import com.educontrol.service.EstudianteService;
import com.educontrol.service.MateriaService;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

	
	@Autowired
	private EstudianteService estudianteService;
	
	@PostMapping("/guardar")
	public Estudiante guardar(@RequestBody Estudiante estudiante) 
	{
		return estudianteService.saveEstudiante(estudiante);
		
	
	}
	
	@GetMapping("/listar")
	public List<Estudiante> listar()
	{
		return estudianteService.findAllEstudiante();
		
		
	}
	
	@PutMapping("/actualizar/{id}")
	public Estudiante actualizar(@PathVariable int id, @RequestBody Estudiante estudiante) {
	
		return estudianteService.updateEstudiante(id, estudiante);
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		estudianteService.deleteEstudiante(id);
		return "estudiante  eliminado correctamente";
		
		
	}
}
