package com.demoyageek.crud_springboot.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estudiante {
    @Id
    int matricula;
    String nombre;
    String apellido;
    String telefono;

    public  Estudiante(){

    }
    public Estudiante(int matricula, String nombre, String apellido, String telefono) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
