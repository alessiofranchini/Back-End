package com.progettosettimanale.progetto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettosettimanale.progetto.model.Dispositivo;
import com.progettosettimanale.progetto.repository.DispositivoDaoRepository;

import jakarta.persistence.EntityExistsException;

@Service
public class DispositivoService {

	@Autowired DispositivoDaoRepository repo;
	
	public Dispositivo saveDispositivo(Dispositivo d) {
		repo.save(d);
		return d;
	}
	
	public List<Dispositivo> getAllDispositivo(){
		return (List<Dispositivo>) repo.findAll();
	}
	
	public String removeDispositivoById(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityExistsException("Il dispositivo con id: " + id + " non esiste");
		}
		repo.deleteById(id);
		return "dispositivo con id "+ id + " eliminato con successo";
	}
	
	public Dispositivo updateDispositivo(Dispositivo d) {
		if(!repo.existsById(d.getId())) {
			throw new EntityExistsException("Il dispositivo che si desidera modificare non esiste");
		}else {
			repo.save(d);
		}
		return d;
		
	}
	
	public Dispositivo getDispositivoById(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityExistsException("Il dispositivo cercato non esiste");
		}
		return repo.findById(id).get();
	}
}
