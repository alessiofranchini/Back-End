package com.GestioneIncendi2.proxy;

import java.util.List;

import com.GestioneIncendi2.models.Installazione;


public interface ProcessoDiControlloAllarmi {
	public void controlloAllarme(List<Installazione> listaSonde);
}
