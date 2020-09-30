package com.exemplo.cursospringboot.demo.services;

import java.util.List;

import com.exemplo.cursospringboot.demo.domain.Funcionario;

public interface FuncionarioService {

	
	void salvar(Funcionario funcionario);
	void editar(Funcionario funcionario);
	void buscarPorId(Long id);
	List<Funcionario> buscarTodos();
}
