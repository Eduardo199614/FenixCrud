package com.tutorial.crud.entity;

import com.tutorial.crud.entity.Producto;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "detalle_producto")
public class DetalleProducto {
    @Id
    @Column(name = "detalleproductoid", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idproducto")
    private Producto idproducto;

    @Size(max = 100)
    @Column(name = "descripcion", length = 100)
    private String descripcion;

    @Size(max = 100)
    @Column(name = "disponibilidad", length = 100)
    private String disponibilidad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

}