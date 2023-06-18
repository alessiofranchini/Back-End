package com.GestioneIncendi2.models;

import java.util.List;

import com.GestioneIncendi2.proxy.ProcessoDiControlloAllarmi;

public class AllarmeIncendio implements ProcessoDiControlloAllarmi {

	@Override
	public void controlloAllarme(List<Installazione> listaSonde) {
		System.out.println("Allarmi rilevati dalle sonde factory:");

		for (Installazione sonda : listaSonde) {
			if (((Sonda) sonda).getQuantitaFumo() > 5) {
				System.out.println("La sonda " + ((Sonda) sonda).getId() + " rileva quantita' di fumo "
						+ (((Sonda) sonda).getQuantitaFumo() - 5) + " unita' al di sopra del limite, ALLARME INCENDIO");

				System.out.println("URL: https://host/alarm?=idsonda=" + ((Sonda) sonda).getId() + "&latitudine="
						+ ((Sonda) sonda).getLatitudine() + "&longitudine=" + ((Sonda) sonda).getLongitudine()
						+ "&smokeLevel=" + ((Sonda) sonda).getQuantitaFumo());
				System.out.println();
			}
		}
	}

	
