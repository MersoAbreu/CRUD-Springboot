package com.exemplo.cursospringboot.demo.dao;

import org.springframework.stereotype.Repository;

import com.exemplo.cursospringboot.demo.domain.Funcionario;


@Repository
public class FuncionarioDaoImpl extends AbstractDao <Funcionario, Long> implements FuncionarioDao {

}
