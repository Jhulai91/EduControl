package com.educontrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.educontrol.entity.Periodo;

import com.educontrol.service.PeriodoService;

@Controller
@RequestMapping("/vistaperiodo")
public class PeriodoVistaController {
	
	@Autowired
	PeriodoService periodoService;

	@GetMapping("/nuevo")
	public String nuevoPeriodo(Model model) {

	    Periodo periodo = new Periodo();
	   

	    model.addAttribute("periodo", periodo);
	
	    
	    return "periodo_nuevo";
	}
	
	@GetMapping("/listar")
	public String listarPeriodo(Model model) {

	    model.addAttribute("periodo", periodoService.findAllPeriodo());

	    return "periodo_listar";
	}
	@PostMapping("/guardar")
	public String guardarPeriodo(@ModelAttribute Periodo periodo) {

	    periodoService.savePeriodo(periodo);

	    return "redirect:/vistaperiodo/listar";
	}
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {

	    periodoService.deletePeriodo(id);

	    return "redirect:/vistaperiodo/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editarPeriodo(@PathVariable Integer id, Model model) {
	    Periodo periodo = periodoService.findById(id);
	    model.addAttribute("periodo", periodo);
	    return "periodo_editar";
	}
}
