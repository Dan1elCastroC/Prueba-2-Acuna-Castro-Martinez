package com.vetnova.atencionclinica.service;

import com.vetnova.atencionclinica.model.FichaClinica;
import com.vetnova.atencionclinica.repository.FichaClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FichaClinicaService {

    @Autowired
    private FichaClinicaRepository repository;

    public List<FichaClinica> findAll() {
        return repository.findAll();
    }

    public Optional<FichaClinica> findById(Long id) {
        return repository.findById(id);
    }

    public FichaClinica save(FichaClinica ficha) {
        return repository.save(ficha);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}