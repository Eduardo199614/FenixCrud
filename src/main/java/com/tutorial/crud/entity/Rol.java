package com.tutorial.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @Column(name = "idrol", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Column(name = "nombre_rol", length = 50)
    private String nombreRol;

    @Size(max = 100)
    @Column(name = "detrol", length = 100)
    private String detrol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDetrol() {
        return detrol;
    }

    public void setDetrol(String detrol) {
        this.detrol = detrol;
    }

}