package com.exemplo.cursospringboot.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exemplo.cursospringboot.demo.dao.CargoDao;
import com.exemplo.cursospringboot.demo.domain.Cargo;


@Service @Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {
	
	@Autowired
	private CargoDao dao;

	@Override @Transactional(readOnly = false)
	public void salvar(Cargo cargo) {
		dao.save(cargo);
		
	}
	
	@Override @Transactional(readOnly = false)
	public void editar(Cargo cargo) {
		dao.update(cargo);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
	
}
