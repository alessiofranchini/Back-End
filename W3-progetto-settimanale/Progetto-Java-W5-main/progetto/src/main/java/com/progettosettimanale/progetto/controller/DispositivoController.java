package com.progettosettimanale.progetto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progettosettimanale.progetto.model.Dispositivo;
import com.progettosettimanale.progetto.service.DispositivoService;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {

	@Autowired DispositivoService dispositivoservice;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<>(dispositivoservice.getAllDispositivo(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> createDispositivo(@RequestBody Dispositivo d){
		return new ResponseEntity<Dispositivo>(dispositivoservice.saveDispositivo(d), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDispositivo(@PathVariable Long id){
		return new ResponseEntity<String>(dispositivoservice.removeDispositivoById(id), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDispositivoById(@PathVariable Long id){
		return new ResponseEntity<Dispositivo>(dispositivoservice.getDispositivoById(id), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateDispositivo(@PathVariable Dispositivo d){
		return new ResponseEntity<Dispositivo>(dispositivoservice.updateDispositivo(d), HttpStatus.CREATED);
	}
	
	
}
