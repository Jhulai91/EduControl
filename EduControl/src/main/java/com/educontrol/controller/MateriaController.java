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

import com.educontrol.entity.Materia;

import com.educontrol.service.MateriaService;


@RestController
@RequestMapping("/materia")
public class MateriaController {

	@Autowired
	private MateriaService materiaService;
	
	@PostMapping("/guardar")
	public Materia guardar(@RequestBody Materia materia) 
	{
		return materiaService.saveMateria(materia);
		
	
	}
	
	@GetMapping("/listar")
	public List<Materia> listar()
	{
		return materiaService.findAllMateria();
		
		
	}
	
	@PutMapping("/actualizar/{id}")
	public Materia actualizar(@PathVariable int id, @RequestBody Materia materia) {
	
		return materiaService.updateMateria(id, materia);
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		materiaService.deleteMateria(id);
		return "materia  eliminado correctamente";
		
		
	}
}
