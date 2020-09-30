package com.exemplo.cursospringboot.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	
	@RequestMapping("/cadastrar")
	public String cadastrar() {
		return "/departamento/cadastro";
	}
	
	
	@RequestMapping("/listar")
	public String listar() {
		return "/departamento/lista";
	}

}
