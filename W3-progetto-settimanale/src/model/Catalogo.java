package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TipoLettura", discriminatorType = DiscriminatorType.STRING)
@Table(name = "catalogo")

public abstract class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codiceISBN;

    @Column(name = "titolo")
    private String titolo;
    @Column(name = "annoPubblicazione")
    private LocalDate annoPubblicazione;
    @Column(name = "numeroPagine")
    private int numeroPagine;

}
