package com.exemplo.cursospringboot.demo.dao;

import org.springframework.stereotype.Repository;

import com.exemplo.cursospringboot.demo.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao <Cargo, Long> implements CargoDao{

}
