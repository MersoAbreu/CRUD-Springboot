package com.exemplo.cursospringboot.demo.dao;

import java.util.List;

import com.exemplo.cursospringboot.demo.domain.Cargo;

public interface CargoDao {
	
	void save(Cargo cargo);
	void delete(Long cargo);
	void  update(Cargo cargo);
	Cargo findById(Long id);
	List<Cargo> findAll();

}
