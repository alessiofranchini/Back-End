package com.GestioneIncendi2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestioneIncendi2.models.Installazione;
import com.GestioneIncendi2.models.Sonda;
import com.GestioneIncendi2.repositories.SondaRepository;
import com.GestioneIncendi2.utils.StatoAllarmeSonda;

@Service
public class SondaService {
	@Autowired
	SondaRepository sondaRepository;

	public void salvaSondaInDb(Installazione sonda) {
		sondaRepository.save((Sonda) sonda);
		System.out.println("Sonda id " + ((Sonda) sonda).getId() + " salvata correttamente!");
	}

	public Sonda trovaSondaById(Integer id) {
		if (sondaRepository.existsById(id)) {
			Sonda sonda = sondaRepository.findById(id).get();
			System.out.println("Sonda trovata in db: " + sonda);
			return sonda;
		} else {
			System.out.println("Non risulta possibile trovare la sonda con id " + id
					+ ", perche' non esiste in database, devi prima aggiungerla!");
		