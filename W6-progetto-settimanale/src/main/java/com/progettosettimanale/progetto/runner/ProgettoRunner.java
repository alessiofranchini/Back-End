package com.progettosettimanale.progetto.runner;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.progettosettimanale.progetto.model.Dispositivo;
import com.progettosettimanale.progetto.model.Utente;
import com.progettosettimanale.progetto.service.DispositivoService;
import com.progettosettimanale.progetto.service.UtenteService;

@Component
public class ProgettoRunner implements CommandLineRunner{

	 @Autowired @Qualifier("FakeUtenteBean") ObjectProvider<Utente> fakeUtenteProvider;
	 @Autowired @Qualifier("DispositivoWNameConfiguration") ObjectProvider<Dispositivo> dispositivoProvider;
	 
	 @Autowired UtenteService utenteservice;
	 @Autowired DispositivoService dispositivoservice;
	 
	 @Override
	 public void run(String... args) throws Exception {
		
		 System.out.println("Run...");
		 
		 //utenteservice.salvaUtente(fakeUtenteProvider.getObject());
		 
		 //dispositivoservice.saveDispositivo(dispositivoProvider.getObject("ipad1"));
		 
		 Dispositivo d = dispositivoservice.getDispositivoById(1l);
		 d.setUtente(utenteservice.findUtenteById(3l));
		 dispositivoservice.updateDispositivo(d);
	}
	 
	 
}
