package com.demoyageek.crud_springboot.Services;

import com.demoyageek.crud_springboot.Entities.Estudiante;
import com.demoyageek.crud_springboot.Repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    EstudianteRepository estudianteRepository;

    /*public EstudianteRepository getEstudianteRepository{
        return estudianteRepository;
    }*/

}
