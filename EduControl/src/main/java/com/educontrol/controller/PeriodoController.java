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

import com.educontrol.entity.Periodo;
import com.educontrol.entity.Usuario;
import com.educontrol.service.PeriodoService;


@RestController
@RequestMapping("/periodo")
public class PeriodoController {

	@Autowired
	private PeriodoService periodoService;
	
	
	@PostMapping("/guardar")
	public Periodo guardar(@RequestBody Periodo periodo) 
	{
		return periodoService.savePeriodo(periodo);
		
	
	}
	
	@GetMapping("/listar")
	public List<Periodo> listar()
	{
		return periodoService.findAllPeriodo();
		
		
	}
	
	@PutMapping("/actualizar/{id}")
	public Periodo actualizar(@PathVariable int id, @RequestBody Periodo periodo) {
	
		return periodoService.updatePeriodo(id, periodo);
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		periodoService.deletePeriodo(id);
		return "periodo eliminado correctamente";
		
		
	}
	
}
