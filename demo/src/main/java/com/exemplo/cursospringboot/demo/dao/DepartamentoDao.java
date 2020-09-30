package com.exemplo.cursospringboot.demo.dao;

import java.util.List;

import com.exemplo.cursospringboot.demo.domain.Departamento;

public interface DepartamentoDao {
	
	
	void save(Departamento departamento);
	void delete(Long departamento);
	void  update(Departamento departamento);
	Departamento findById(Long id);
	List<Departamento> findAll();

}
