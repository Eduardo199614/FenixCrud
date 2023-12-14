package com.tutorial.crud.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ClienteVentaId implements Serializable {
    private static final long serialVersionUID = -7793755836216527351L;
    @NotNull
    @Column(name = "idcliente", nullable = false)
    private Integer idcliente;

    @NotNull
    @Column(name = "idventa", nullable = false)
    private Integer idventa;

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Integer getIdventa() {
        return idventa;
    }

    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ClienteVentaId entity = (ClienteVentaId) o;
        return Objects.equals(this.idventa, entity.idventa) &&
                Objects.equals(this.idcliente, entity.idcliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idventa, idcliente);
    }

}