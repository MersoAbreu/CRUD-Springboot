package com.exemplo.cursospringboot.demo.services;

import java.util.List;

import com.exemplo.cursospringboot.demo.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);
	void editar(Cargo cargo);
	void excluir (Long id);
	Cargo buscarPorId(Long id);
	List<Cargo> buscarTodos();
}
