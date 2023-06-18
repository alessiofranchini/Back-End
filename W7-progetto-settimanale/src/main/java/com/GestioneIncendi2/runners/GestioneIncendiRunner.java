package com.GestioneIncendi2.runners;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestioneIncendi2.factory.Factory;
import com.GestioneIncendi2.models.AllarmeIncendio;
import com.GestioneIncendi2.models.Installazione;
import com.GestioneIncendi2.models.Sonda;
import com.GestioneIncendi2.observer.CentroDiControllo;
import com.GestioneIncendi2.services.SondaService;

@Component
public class GestioneIncendiRunner implements ApplicationRunner {

	@Autowired
	SondaService sondaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println();
		System.out.println("GestioneIncendiRunner Run...");
		System.out.println();
