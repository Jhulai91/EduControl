package com.educontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.educontrol.entity.Usuario;

import jakarta.servlet.http.HttpSession;
@Controller
public class HomeController {

	 @GetMapping("/home_admin")
	    public String homeAdmin(HttpSession session, Model model) {

	        Usuario usuario = (Usuario) session.getAttribute("usuario");

	        if (usuario == null) {
	            return "redirect:/login";
	        }

	        model.addAttribute("usuario", usuario);

	        return "home_admin";
	    }

	    @GetMapping("/home_estudiante")
	    public String homeEstudiante(HttpSession session, Model model) {

	        Usuario usuario = (Usuario) session.getAttribute("usuario");

	        if (usuario == null) {
	            return "redirect:/login";
	        }

	        model.addAttribute("usuario", usuario);

	        return "home_estudiante";
	    }
	    
	    @GetMapping("/home_docente")
	    public String homeDocente(HttpSession session, Model model) {

	        Usuario usuario = (Usuario) session.getAttribute("usuario");

	        if (usuario == null) {
	            return "redirect:/login";
	        }

	        model.addAttribute("usuario", usuario);

	        // 🔥 Datos simulados o desde BD
	        model.addAttribute("totalCursos", 3);
	        model.addAttribute("totalMaterias", 4);
	        model.addAttribute("totalCarga", 7);

	      //  model.addAttribute("cursos", listaCursos);
	        //model.addAttribute("materias", listaMaterias);

	        return "home_docente";
	    }
}
