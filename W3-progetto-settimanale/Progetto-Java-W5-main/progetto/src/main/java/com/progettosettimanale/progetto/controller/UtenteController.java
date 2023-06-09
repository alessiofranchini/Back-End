package com.progettosettimanale.progetto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progettosettimanale.progetto.model.Utente;
import com.progettosettimanale.progetto.service.UtenteService;

@RestController
@RequestMapping("/utente")
public class UtenteController {

	@Autowired UtenteService utenteservice;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<>(utenteservice.getAllUtente(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> createUtente(@RequestBody Utente u){
		return new ResponseEntity<Utente>(utenteservice.salvaUtente(u), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUtente(@PathVariable Long id){
		return new ResponseEntity<String>(utenteservice.removeUserById(id), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUtenteById(@PathVariable Long id){
		return new ResponseEntity<Utente>(utenteservice.findUtenteById(id), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUtente(@PathVariable Utente u){
		return new ResponseEntity<Utente>(utenteservice.updateUtente(u), HttpStatus.CREATED);
	}
}
