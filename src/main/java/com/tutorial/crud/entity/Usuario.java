package com.tutorial.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "idusuario", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Column(name = "nomusuario", length = 50)
    private String nomusuario;

    @Size(max = 50)
    @Column(name = "emailusuario", length = 50)
    private String emailusuario;

    @Size(max = 50)
    @Column(name = "passwordusuario", length = 50)
    private String passwordusuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomusuario() {
        return nomusuario;
    }

    public void setNomusuario(String nomusuario) {
        this.nomusuario = nomusuario;
    }

    public String getEmailusuario() {
        return emailusuario;
    }

    public void setEmailusuario(String emailusuario) {
        this.emailusuario = emailusuario;
    }

    public String getPasswordusuario() {
        return passwordusuario;
    }

    public void setPasswordusuario(String passwordusuario) {
        this.passwordusuario = passwordusuario;
    }

}