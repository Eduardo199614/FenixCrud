package com.tutorial.crud.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProveerdorProductoId implements Serializable {
    private static final long serialVersionUID = 3625885203133856895L;
    @NotNull
    @Column(name = "idproveedor", nullable = false)
    private Integer idproveedor;

    @NotNull
    @Column(name = "idproducto", nullable = false)
    private Integer idproducto;

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProveerdorProductoId entity = (ProveerdorProductoId) o;
        return Objects.equals(this.idproveedor, entity.idproveedor) &&
                Objects.equals(this.idproducto, entity.idproducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idproveedor, idproducto);
    }

}