package com.example.vendedor.models.entity;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.NamedMethodGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table (name  = "vendedor")
public class vendedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "NIT")
    @Id
    private long id;



    @NotEmpty(message = "No puede estar vacio")
    @Size(min=2, max=20, message="el tamaño tiene que estar entre 2 y 20")




    @Column(name = "Categoria")
    @NotEmpty(message = "No puede estar vacio")
    private String categoria;


   @NotEmpty(message = "No puede estar vacio")
    private String nomempresa;

    @Column(name = "Email")
    @NotEmpty(message = "No puede estar vacio")
    @Email (message = "No es un direccion de correo bien formada")
    private String email;


    private Integer telempresa;


    private Long idcategoria;


    public Integer getTelempresa() {
        return telempresa;
    }
    public void setTelempresa(Integer telempresa) {
        this.telempresa = telempresa;
    }

    public Long getIdcategoria() {
        return idcategoria;
    }



    public void setIdcategoria(Long idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNomempresa() {
        return nomempresa;
    }
    public void setNomempresa(String nomempresa) {
        this.nomempresa = nomempresa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


}

