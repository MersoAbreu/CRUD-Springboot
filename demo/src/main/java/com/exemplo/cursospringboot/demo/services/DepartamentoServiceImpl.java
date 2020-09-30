package com.exemplo.cursospringboot.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exemplo.cursospringboot.demo.dao.DepartamentoDao;
import com.exemplo.cursospringboot.demo.domain.Departamento;

@Service
@Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;

	@Override @Transactional(readOnly = false)
	public void salvar(Departamento departamento) {
		dao.save(departamento);

	}

	@Override @Transactional(readOnly = false)
	public void editar(Departamento departamento) {
		dao.update(departamento);

	}

	@Override
	@Transactional(readOnly = true)
	public void buscarPorId(Long id) {
		dao.findById(id);

	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {

		return dao.findAll();
	}

}
