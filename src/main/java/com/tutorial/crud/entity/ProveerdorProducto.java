package com.tutorial.crud.entity;

import javax.persistence.*;

@Entity
@Table(name = "proveerdor_producto")
public class ProveerdorProducto {
    @EmbeddedId
    private ProveerdorProductoId id;

    @MapsId("idproveedor")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idproveedor", nullable = false)
    private Proveedor idproveedor;

    @MapsId("idproducto")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idproducto", nullable = false)
    private Producto idproducto;

    public ProveerdorProductoId getId() {
        return id;
    }

    public void setId(ProveerdorProductoId id) {
        this.id = id;
    }

    public Proveedor getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Proveedor idproveedor) {
        this.idproveedor = idproveedor;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

}