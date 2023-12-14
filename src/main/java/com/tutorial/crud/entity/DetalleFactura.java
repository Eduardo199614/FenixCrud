package com.tutorial.crud.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {
    @Id
    @Column(name = "coddetalle", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idfactura", nullable = false)
    private Factura idfactura;

    @Column(name = "numfactura")
    private Integer numfactura;

    @Column(name = "cattidadfactura")
    private Integer cattidadfactura;

    @Column(name = "valorventa", precision = 6, scale = 2)
    private BigDecimal valorventa;

    @Column(name = "totaldetalle", precision = 6, scale = 2)
    private BigDecimal totaldetalle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Factura getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Factura idfactura) {
        this.idfactura = idfactura;
    }

    public Integer getNumfactura() {
        return numfactura;
    }

    public void setNumfactura(Integer numfactura) {
        this.numfactura = numfactura;
    }

    public Integer getCattidadfactura() {
        return cattidadfactura;
    }

    public void setCattidadfactura(Integer cattidadfactura) {
        this.cattidadfactura = cattidadfactura;
    }

    public BigDecimal getValorventa() {
        return valorventa;
    }

    public void setValorventa(BigDecimal valorventa) {
        this.valorventa = valorventa;
    }

    public BigDecimal getTotaldetalle() {
        return totaldetalle;
    }

    public void setTotaldetalle(BigDecimal totaldetalle) {
        this.totaldetalle = totaldetalle;
    }

}