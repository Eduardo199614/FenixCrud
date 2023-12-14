package com.tutorial.crud.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsuarioRolId implements Serializable {
    private static final long serialVersionUID = 2144345627637113282L;
    @NotNull
    @Column(name = "idusuario", nullable = false)
    private Integer idusuario;

    @NotNull
    @Column(name = "idrol", nullable = false)
    private Integer idrol;

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuarioRolId entity = (UsuarioRolId) o;
        return Objects.equals(this.idrol, entity.idrol) &&
                Objects.equals(this.idusuario, entity.idusuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idrol, idusuario);
    }

}