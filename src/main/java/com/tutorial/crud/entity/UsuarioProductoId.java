package com.tutorial.crud.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsuarioProductoId implements Serializable {
    private static final long serialVersionUID = 4246214230640936879L;
    @NotNull
    @Column(name = "idproducto", nullable = false)
    private Integer idproducto;

    @NotNull
    @Column(name = "idusuario", nullable = false)
    private Integer idusuario;

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuarioProductoId entity = (UsuarioProductoId) o;
        return Objects.equals(this.idproducto, entity.idproducto) &&
                Objects.equals(this.idusuario, entity.idusuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idproducto, idusuario);
    }

}