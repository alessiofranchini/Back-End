package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "riviste")
@DiscriminatorValue("Rivista")
public class Riviste extends Catalogo {

    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

}
