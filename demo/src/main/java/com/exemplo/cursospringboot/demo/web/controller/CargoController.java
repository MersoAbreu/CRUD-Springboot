package com.exemplo.cursospringboot.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargoController {
	
	@RequestMapping("/cadastrar")
	public String cadastrar() {
		return "/cargo/cadastro";
	}
	
	@RequestMapping("/listar")
	public String listar() {
		return "/cargo/lista";
	}
}
