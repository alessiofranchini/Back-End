package com.GestioneIncendi2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestioneIncendi2.models.Sonda;

@Repository
public interface SondaRepository extends JpaRepository<Sonda, Integer> {

}
