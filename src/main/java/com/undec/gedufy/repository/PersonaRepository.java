package com.undec.gedufy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.undec.gedufy.model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    List<Persona> findAllByNombreContaining(String nombre);


    Optional<Persona> findByEmail(String email);

    boolean existsPersonaByEmail(String email);


}
