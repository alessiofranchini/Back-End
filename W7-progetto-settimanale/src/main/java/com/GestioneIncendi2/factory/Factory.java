package com.GestioneIncendi2.factory;

import com.GestioneIncendi2.models.Installazione;
import com.GestioneIncendi2.models.Sonda;


public class Factory {
	public static Installazione definisciTipo(String tipo) {
		if (tipo == null) {
			return null;
		} else if (tipo.equalsIgnoreCase("SONDA")) {
			return new Sonda(null, null, null, null, null); // qui è tutto null perché costruisco con valori random nel
															// costruttore di Sonda
		}
		return null;
	}
}
