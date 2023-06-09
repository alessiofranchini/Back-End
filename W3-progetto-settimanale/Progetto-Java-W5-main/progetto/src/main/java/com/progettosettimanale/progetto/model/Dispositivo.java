package com.progettosettimanale.progetto.model;

import org.hibernate.type.EnumType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="dispositivi")
public class Dispositivo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String stato;
	@ManyToOne
	private Utente utente;
	
	
	public Dispositivo(String name) {
		super();
		this.name = name;
		this.stato = changeStato();
	}
	
	public String changeStato() {   
		if(this.utente == null) {
			return "DISPONIBILE";
		}else {
			return "ASSEGNATO";
		}
		
	}
	
	
	
}
