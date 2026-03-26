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

import com.educontrol.entity.Curso;
import com.educontrol.entity.Docente;
import com.educontrol.service.CursoService;
import com.educontrol.service.DocenteService;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@PostMapping("/guardar")
	public Curso guardar(@RequestBody Curso curso) 
	{
		return cursoService.saveCurso(curso);
		
	
	}
	
	@GetMapping("/listar")
	public List<Curso> listar()
	{
		return cursoService.findAllCurso();
		
		
	}
	
	@PutMapping("/actualizar/{id}")
	public Curso actualizar(@PathVariable int id, @RequestBody Curso curso) {
	
		return cursoService.updateCurso(id, curso);
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		cursoService.deleteCurso(id);
		return "curso  eliminado correctamente";
		
		
	}
	
}
