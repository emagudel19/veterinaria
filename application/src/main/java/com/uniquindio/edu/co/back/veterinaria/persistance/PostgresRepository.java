package com.uniquindio.edu.co.back.veterinaria.persistance;

import org.springframework.data.repository.CrudRepository;

import com.uniquindio.edu.co.back.veterinaria.dao.Usuario;

public interface PostgresRepository extends CrudRepository<Usuario, Long> {

}
