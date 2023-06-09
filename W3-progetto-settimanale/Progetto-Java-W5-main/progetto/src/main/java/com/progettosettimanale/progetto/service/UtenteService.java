package com.progettosettimanale.progetto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettosettimanale.progetto.model.Utente;
import com.progettosettimanale.progetto.repository.UtenteDaoRepository;

import jakarta.persistence.EntityExistsException;

@Service
public class UtenteService {

	@Autowired UtenteDaoRepository repo;
	
	public Utente salvaUtente(Utente u) {
		repo.save(u);
		return u;
	}
	
	public List<Utente> getAllUtente(){
		return (List<Utente>) repo.findAll();
	}
	
	public String removeUserById(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityExistsException("L'utente con id " + id + " non esiste");
		}
		repo.deleteById(id);
		return "Utente con id " + id + " eliminato con successo";
	}
	
	public Utente updateUtente(Utente u) {
		if(!repo.existsById(u.getId())) {
			throw new EntityExistsException("L'utente che si vuole modificare (con id: " + u.getId() + " non esiste");
		}else {
			repo.save(u);
		}
		
		return u;
	}
	
	public Utente findUtenteById(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityExistsException("L'utente con id " + id + " non esiste");
		}
		return repo.findById(id).get();
	}
	
}
