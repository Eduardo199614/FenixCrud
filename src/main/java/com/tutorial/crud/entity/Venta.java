package com.tutorial.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @Column(name = "idventa", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "fechaventa", length = 100)
    private String fechaventa;

    @Column(name = "catidadventa")
    private Integer catidadventa;

    @Column(name = "preciounitario", precision = 10, scale = 2)
    private BigDecimal preciounitario;

    @Column(name = "subtotoal", precision = 10, scale = 2)
    private BigDecimal subtotoal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(String fechaventa) {
        this.fechaventa = fechaventa;
    }

    public Integer getCatidadventa() {
        return catidadventa;
    }

    public void setCatidadventa(Integer catidadventa) {
        this.catidadventa = catidadventa;
    }

    public BigDecimal getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(BigDecimal preciounitario) {
        this.preciounitario = preciounitario;
    }

    public BigDecimal getSubtotoal() {
        return subtotoal;
    }

    public void setSubtotoal(BigDecimal subtotoal) {
        this.subtotoal = subtotoal;
    }

}