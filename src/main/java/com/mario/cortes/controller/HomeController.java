package com.mario.cortes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mario.cortes.service.IntProductoService;

@Controller
public class HomeController {
	
	@Autowired
	private IntProductoService productoService;
	
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
	@GetMapping("/")
	public String mostrarIndex(Model model) {
		
		model.addAttribute("productos", productoService.obtenerTodos());
		return "home";
	}
}
