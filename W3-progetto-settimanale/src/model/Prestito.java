package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
//@Table(name = "prestito")
@DiscriminatorValue("Prestito")
public class Prestito extends Utente {
    @Column(name = "dataInizioPrestito")
    private LocalDate dataInizioPrestito;
    @Column(name = "dataRestituzionePrevista")
    private LocalDate dataRestituzionePrevista = dataInizioPrestito.plusDays(30);
    @Column(name = "dataRestituzioneEffettiva")
    private LocalDate dataRestituzioneEffettiva;
}
