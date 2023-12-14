package com.tutorial.crud.entity;

import com.tutorial.crud.entity.Producto;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tipo_produto")
public class TipoProduto {
    @Id
    @Column(name = "idtipoproducto", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idproducto", nullable = false)
    private Producto idproducto;

    @Size(max = 100)
    @Column(name = "nombretipoproducto", length = 100)
    private String nombretipoproducto;

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

    public String getNombretipoproducto() {
        return nombretipoproducto;
    }

    public void setNombretipoproducto(String nombretipoproducto) {
        this.nombretipoproducto = nombretipoproducto;
    }

}