package com.uniquindio.edu.co.back.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uniquindio.edu.co.back.veterinaria.dao.Usuario;
import com.uniquindio.edu.co.back.veterinaria.model.UsuarioRequest;
import com.uniquindio.edu.co.back.veterinaria.service.VeterinariaService;

@RestController
@RequestMapping(value = "/veterinaria")
public class veterinariaController {

	@Autowired
	VeterinariaService service;

	@PostMapping(value = "/crearUsuario", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody String CreateUser(@RequestBody UsuarioRequest request) {

		return service.CreateUser(request);

	}

	@PutMapping(value = "/eliminarUsuario", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody String delete(@RequestParam("id") String id) {

		Long userId = Long.parseLong(id);
		return service.DeleteUser(userId);

	}
	
	@GetMapping(value= "/listaUsuario", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<Usuario> get() {
		
		return service.get();
	}
		
	}

