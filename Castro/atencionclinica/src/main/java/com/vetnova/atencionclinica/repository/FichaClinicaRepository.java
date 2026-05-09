package com.vetnova.atencionclinica.repository;

import com.vetnova.atencionclinica.model.FichaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FichaClinicaRepository extends JpaRepository<FichaClinica, Long> {
    
    // Operación de procesamiento extra exigida: Buscar fichas de una mascota en específico
    List<FichaClinica> findByMascota(String mascota);
}