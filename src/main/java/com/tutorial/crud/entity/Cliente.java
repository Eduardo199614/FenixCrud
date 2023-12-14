package com.tutorial.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "idcliente", nullable = false)
    private Integer id;

    @Column(name = "ruccliente", precision = 13)
    private BigDecimal ruccliente;

    @Size(max = 100)
    @Column(name = "nomcliente", length = 100)
    private String nomcliente;

    @Size(max = 100)
    @Column(name = "apelcliente", length = 100)
    private String apelcliente;

    @Size(max = 100)
    @Column(name = "dircliente", length = 100)
    private String dircliente;

    @Column(name = "telfcliente")
    private Integer telfcliente;

    @Size(max = 100)
    @Column(name = "mailcliente", length = 100)
    private String mailcliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getRuccliente() {
        return ruccliente;
    }

    public void setRuccliente(BigDecimal ruccliente) {
        this.ruccliente = ruccliente;
    }

    public String getNomcliente() {
        return nomcliente;
    }

    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    public String getApelcliente() {
        return apelcliente;
    }

    public void setApelcliente(String apelcliente) {
        this.apelcliente = apelcliente;
    }

    public String getDircliente() {
        return dircliente;
    }

    public void setDircliente(String dircliente) {
        this.dircliente = dircliente;
    }

    public Integer getTelfcliente() {
        return telfcliente;
    }

    public void setTelfcliente(Integer telfcliente) {
        this.telfcliente = telfcliente;
    }

    public String getMailcliente() {
        return mailcliente;
    }

    public void setMailcliente(String mailcliente) {
        this.mailcliente = mailcliente;
    }

}