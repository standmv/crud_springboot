package com.demoyageek.crud_springboot.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Equipo implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private Double costoAlquiler = 0.01;
    private boolean habilitado = true;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCostoAlquiler() {
        return costoAlquiler;
    }

    public void setCostoAlquiler(Double costoAlquiler) {
        this.costoAlquiler = costoAlquiler;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
