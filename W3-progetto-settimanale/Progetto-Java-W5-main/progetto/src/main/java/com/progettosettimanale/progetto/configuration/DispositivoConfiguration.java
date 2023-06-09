package com.progettosettimanale.progetto.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.progettosettimanale.progetto.model.Dispositivo;
import com.progettosettimanale.progetto.model.Utente;


@Configuration
public class DispositivoConfiguration {

	@Bean("DispositivoWNameConfiguration")
	@Scope("prototype")
	public Dispositivo createDispositivo(String name) {
		return new Dispositivo(name);
	}
	
	@Bean("CustomDispositivoConfiguration")
	@Scope("prototype")
	public Dispositivo createCustomDispositivo() {
		return new Dispositivo();
	}
}
