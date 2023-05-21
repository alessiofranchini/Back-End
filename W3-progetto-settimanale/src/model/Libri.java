package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "libri")
@DiscriminatorValue("Libro")
public class Libri extends Catalogo {

    private String autore;

    private String genere;

}
