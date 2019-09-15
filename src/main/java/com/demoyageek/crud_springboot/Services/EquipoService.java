package com.demoyageek.crud_springboot.Services;

import com.demoyageek.crud_springboot.Repositories.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;


}
