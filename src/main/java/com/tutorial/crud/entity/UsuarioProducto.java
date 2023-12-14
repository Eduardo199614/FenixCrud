package com.tutorial.crud.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuario_producto")
public class UsuarioProducto {
    @EmbeddedId
    private UsuarioProductoId id;

    @MapsId("idproducto")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idproducto", nullable = false)
    private Producto idproducto;

    @MapsId("idusuario")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idusuario", nullable = false)
    private Usuario idusuario;

    public UsuarioProductoId getId() {
        return id;
    }

    public void setId(UsuarioProductoId id) {
        this.id = id;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

}