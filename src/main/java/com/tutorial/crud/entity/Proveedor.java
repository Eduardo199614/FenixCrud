package com.tutorial.crud.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "proveedor")
public class Proveedor {
    @Id
    @Column(name = "idproveedor", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idempresa", nullable = false)
    private Empresa idempresa;

    @Size(max = 100)
    @Column(name = "nomproveedor", length = 100)
    private String nomproveedor;

    @Column(name = "telefproveedro")
    private Integer telefproveedro;

    @Size(max = 100)
    @Column(name = "correoproveedor", length = 100)
    private String correoproveedor;

    @Size(max = 100)
    @Column(name = "direccionproveedor", length = 100)
    private String direccionproveedor;

    @Size(max = 100)
    @Column(name = "ciuproveedor", length = 100)
    private String ciuproveedor;

    @Size(max = 100)
    @Column(name = "paisproveedor", length = 100)
    private String paisproveedor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Empresa getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Empresa idempresa) {
        this.idempresa = idempresa;
    }

    public String getNomproveedor() {
        return nomproveedor;
    }

    public void setNomproveedor(String nomproveedor) {
        this.nomproveedor = nomproveedor;
    }

    public Integer getTelefproveedro() {
        return telefproveedro;
    }

    public void setTelefproveedro(Integer telefproveedro) {
        this.telefproveedro = telefproveedro;
    }

    public String getCorreoproveedor() {
        return correoproveedor;
    }

    public void setCorreoproveedor(String correoproveedor) {
        this.correoproveedor = correoproveedor;
    }

    public String getDireccionproveedor() {
        return direccionproveedor;
    }

    public void setDireccionproveedor(String direccionproveedor) {
        this.direccionproveedor = direccionproveedor;
    }

    public String getCiuproveedor() {
        return ciuproveedor;
    }

    public void setCiuproveedor(String ciuproveedor) {
        this.ciuproveedor = ciuproveedor;
    }

    public String getPaisproveedor() {
        return paisproveedor;
    }

    public void setPaisproveedor(String paisproveedor) {
        this.paisproveedor = paisproveedor;
    }

}