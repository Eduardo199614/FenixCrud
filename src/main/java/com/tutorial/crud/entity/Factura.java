package com.tutorial.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "factura")
public class Factura {
    @Id
    @Column(name = "idfactura", nullable = false)
    private Integer id;

    @Column(name = "numfactura")
    private Integer numfactura;

    @Column(name = "feachafactura")
    private Integer feachafactura;

    @Column(name = "articulosfactura")
    private Integer articulosfactura;

    @Column(name = "cantidadfactura")
    private Integer cantidadfactura;

    @Column(name = "preciofactura", precision = 10, scale = 2)
    private BigDecimal preciofactura;

    @Column(name = "totalfactura", precision = 10, scale = 2)
    private BigDecimal totalfactura;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumfactura() {
        return numfactura;
    }

    public void setNumfactura(Integer numfactura) {
        this.numfactura = numfactura;
    }

    public Integer getFeachafactura() {
        return feachafactura;
    }

    public void setFeachafactura(Integer feachafactura) {
        this.feachafactura = feachafactura;
    }

    public Integer getArticulosfactura() {
        return articulosfactura;
    }

    public void setArticulosfactura(Integer articulosfactura) {
        this.articulosfactura = articulosfactura;
    }

    public Integer getCantidadfactura() {
        return cantidadfactura;
    }

    public void setCantidadfactura(Integer cantidadfactura) {
        this.cantidadfactura = cantidadfactura;
    }

    public BigDecimal getPreciofactura() {
        return preciofactura;
    }

    public void setPreciofactura(BigDecimal preciofactura) {
        this.preciofactura = preciofactura;
    }

    public BigDecimal getTotalfactura() {
        return totalfactura;
    }

    public void setTotalfactura(BigDecimal totalfactura) {
        this.totalfactura = totalfactura;
    }

}