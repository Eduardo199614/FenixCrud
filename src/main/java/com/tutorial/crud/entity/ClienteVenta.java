package com.tutorial.crud.entity;

import javax.persistence.*;

@Entity
@Table(name = "cliente_ventas")
public class ClienteVenta {
    @EmbeddedId
    private ClienteVentaId id;

    @MapsId("idcliente")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idcliente", nullable = false)
    private Cliente idcliente;

    public ClienteVentaId getId() {
        return id;
    }

    public void setId(ClienteVentaId id) {
        this.id = id;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

}