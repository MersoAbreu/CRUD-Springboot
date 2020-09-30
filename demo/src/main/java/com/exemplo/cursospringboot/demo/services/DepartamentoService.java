package com.exemplo.cursospringboot.demo.services;

import java.util.List;

import com.exemplo.cursospringboot.demo.domain.Departamento;

public interface DepartamentoService {

	
	void salvar (Departamento departamento);
	void editar (Departamento departamento);
	void buscarPorId(Long id);
	List<Departamento> buscarTodos();
}
