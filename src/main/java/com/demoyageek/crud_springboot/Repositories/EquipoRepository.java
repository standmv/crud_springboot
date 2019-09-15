package com.demoyageek.crud_springboot.Repositories;

import com.demoyageek.crud_springboot.Entities.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    Equipo findByNombreAndHabilitado(String nombre, boolean habilitado);
    List<Equipo> findAllByHabilitado(boolean habilitado);


}
