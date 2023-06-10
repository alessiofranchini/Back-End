package com.progettosettimanale.progetto.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.progettosettimanale.progetto.model.Utente;

@Configuration
public class UtenteConfiguration {

	@Bean("FakeUtenteBean")
	@Scope("prototype")
	public Utente createFakeUtente() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		
		return Utente.builder().username(fake.name().firstName() + fake.name().lastName() + fake.number()
		.numberBetween(1, 99)).nome(fake.name().firstName()).cognome(fake.name().lastName())
		.email(fake.internet().emailAddress()).build();
		
	}
	
	@Bean("CustomUtenteBean")
	@Scope("prototype")
	public Utente createCustomUtente() {
		return new Utente();
	}
}
