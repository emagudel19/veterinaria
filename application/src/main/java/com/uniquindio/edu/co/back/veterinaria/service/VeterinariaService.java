package com.uniquindio.edu.co.back.veterinaria.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniquindio.edu.co.back.veterinaria.dao.Usuario;
import com.uniquindio.edu.co.back.veterinaria.model.UsuarioRequest;
import com.uniquindio.edu.co.back.veterinaria.persistance.PostgresRepository;

@Service
public class VeterinariaService {

	@Autowired
	PostgresRepository repository;

	public String CreateUser(UsuarioRequest usuario) {
		repository.save(new Usuario(usuario.getNombre(), usuario.getMascota()));
		return "usuario creado exitosamente";

	}

	public String DeleteUser(Long id) {
		
		repository.deleteById(id);
	
		return "usuario eliminado exitosamente";
	}
	
	public List<Usuario> get(){
		
		Iterable<Usuario> it = repository.findAll();

        List<Usuario> users = new ArrayList<Usuario>();
        it.forEach(e -> users.add(e));

        return users;
		
	}

}
