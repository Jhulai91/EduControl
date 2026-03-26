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

import com.educontrol.entity.Docente;
import com.educontrol.entity.Especializacion;
import com.educontrol.service.DocenteService;
import com.educontrol.service.EspecializacionService;

@RestController
@RequestMapping("/docente")
public class DocenteController {

	@Autowired
	private DocenteService docenteService;
	
	@PostMapping("/guardar")
	public Docente guardar(@RequestBody Docente docente) 
	{
		//return docenteService.saveDocente(docente);
		docenteService.crearDocenteUsuairo(docente.getUsuario(), docente);
		return docente;
	}
	
	@GetMapping("/listar")
	public List<Docente> listar()
	{
		return docenteService.findAllDocente();
		
		
	}
	
	@PutMapping("/actualizar/{id}")
	public Docente actualizar(@PathVariable int id, @RequestBody Docente docente) {
	
		return docenteService.updateDocente(id, docente);
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		docenteService.deleteDocente(id);
		return "docente  eliminado correctamente";
		
		
	}
	
}
