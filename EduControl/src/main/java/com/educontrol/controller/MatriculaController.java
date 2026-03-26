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

import com.educontrol.entity.Matricula;
import com.educontrol.entity.Periodo;
import com.educontrol.service.MatriculaService;


@RestController
@RequestMapping("/matricula")
public class MatriculaController {

	@Autowired
	private MatriculaService matriculaService;
	
	@PostMapping("/guardar")
	public Matricula guardar(@RequestBody Matricula matricula) 
	{
		return matriculaService.saveMatricula(matricula);
		
	
	}
	
	@GetMapping("/listar")
	public List<Matricula> listar()
	{
		return matriculaService.findAllMtaricula();
		
		
	}
	
	@PutMapping("/actualizar/{id}")
	public Matricula actualizar(@PathVariable int id, @RequestBody Matricula matricula) {
	
		return matriculaService.updateMatricula(id, matricula);
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		matriculaService.deleteMatricula(id);
		return "matricula  eliminado correctamente";
		
		
	}
	
}
