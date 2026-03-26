package com.educontrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.educontrol.entity.Usuario;
import com.educontrol.service.UsuarioService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
	 @Autowired
	    private UsuarioService usuarioService;
	 
	 @GetMapping("/")
	 public String inicio() {
	     return "redirect:/login";
	 }

	    @GetMapping("/login")
	    public String mostrarLogin() {
	        return "login"; 
	    }

	    @PostMapping("/login")
	    public String procesarLogin(@RequestParam String usuarioNick,
	                                @RequestParam String usuarioPassword,
	                                Model model, HttpSession session) {

	        Usuario usuario = usuarioService.login(usuarioNick, usuarioPassword);

	        if (usuario != null) {
	        	session.setAttribute("usuario", usuario);
	        if (usuario.getRolusuario().getIdRol() == 4) {
	            return "redirect:/home_admin";
	        } else if (usuario.getRolusuario().getIdRol() == 3) {
	            return "redirect:/home_estudiante";
	        } else if (usuario.getRolusuario().getIdRol() == 2)  {
	            return "redirect:/home_docente"; // fallback
	        }

	    } 
	        model.addAttribute("error", true);
	        return "login";
	    


	    }
	    
	    @GetMapping("/logout")
	    public String logout(HttpSession session) {
	        session.invalidate();
	        return "redirect:/login";
	    }
	    
	    
}
