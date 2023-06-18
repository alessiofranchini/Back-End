package com.GestioneIncendi2.observer;

import java.util.ArrayList;
import java.util.List;

import com.GestioneIncendi2.models.Installazione;
import com.GestioneIncendi2.proxy.ProcessoDiControlloAllarmi;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CentroDiControllo {
	List<Installazione> listaSonde;

	private List<ProcessoDiControlloAllarmi> processiDiControllo = new ArrayList<>();

	public void aggiungiObserver(ProcessoDiControlloAllarmi observer) {
		processiDiControllo.add(observer);
	}

	public void rimuoviObserver(ProcessoDiControlloAllarmi observer) {
		processiDiControllo.remove(observer);
	}

	public void notificaObserver() {
		for (ProcessoDiControlloAllarmi processoDiControlloAllarmi : processiDiControllo) {
			processoDiControlloAllarmi.controlloAllarme(listaSonde);
		}
	}
}
