package com.GestioneIncendi2.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestioneIncendi2.models.Sonda;
import com.GestioneIncendi2.repositories.SondaRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/lista-sonde")
public class SondaController {

	@Autowired
	SondaRepository sondaRepository;

	@GetMapping
	public Page<Sonda> listaSonde(Pageable pageable) {
		Page<Sonda> trovaSonde = sondaRepository.findAll(pageable);
		return trovaSonde;
	}
}
