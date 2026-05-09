package com.vetnova.atencionclinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vetnova.atencionclinica.model.Atencion;

public interface AtencionRepository extends JpaRepository<Atencion, Long> {
    
}