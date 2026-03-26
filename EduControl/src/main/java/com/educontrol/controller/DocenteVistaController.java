package com.educontrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.educontrol.entity.Docente;
import com.educontrol.entity.Especializacion;
import com.educontrol.entity.Usuario;
import com.educontrol.service.DocenteService;
import com.educontrol.service.EspecializacionService;
import com.educontrol.service.RolUsuarioService;

@Controller
@RequestMapping("/vistadocente")
public class DocenteVistaController {
	
	@Autowired
	DocenteService docenteService;
	
	@Autowired
	EspecializacionService especializacionService;
	
	@Autowired
	RolUsuarioService rolUsuarioService;

	@GetMapping("/nuevo")
	public String nuevoDocente(Model model) {

	    Docente docente = new Docente();
	    docente.setUsuario(new Usuario());
	    docente.setEspecializacion(new Especializacion()); 

	    model.addAttribute("docente", docente);
	
	    model.addAttribute("especializaciones", especializacionService.findAllEspecializacion());
	    model.addAttribute("roles", rolUsuarioService.findAllRolUsuario());
	    return "docente_form";
	}
	
	@GetMapping("/listar")
	public String listarDocentes(Model model) {

	    model.addAttribute("docentes", docenteService.findAllDocente());

	    return "docente_listar";
	}
	@PostMapping("/guardar-form")
	public String guardarDocente(@ModelAttribute Docente docente) {

	    docenteService.crearDocenteUsuairo(
	        docente.getUsuario(),
	        docente
	    );

	    return "redirect:/vistadocente/listar";
	}
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {

	    docenteService.deleteDocente(id);

	    return "redirect:/vistadocente/listar";
	}
}
