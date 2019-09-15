package com.demoyageek.crud_springboot.Repositories;

import com.demoyageek.crud_springboot.Entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    List<Estudiante> findAll();
    Estudiante findByMatricula(int matricula);

}
