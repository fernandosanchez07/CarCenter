package com.carcenter.carcenter.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "clientes")
public class ClienteEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "tipo_documento", length = 2)
    private String tipoDocumento;

    @Id
    @Column(name = "documento")
    private int documento;

    @Column(name = "primer_nombre", length = 30)
    private String primerNombre;

    @Column(name = "segundo_nombre", length = 30)
    private String segundoNombre;

    @Column(name = "primer_apellido", length = 30)
    private String primerApellido;

    @Column(name = "segundo_apellido", length = 30)
    private String segundoApellido;

    @Column(name = "celular", length = 10)
    private String celular;

    @Column(name = "direccion", length = 200)
    private String direccion;

    @Column(name = "email", length = 100)
    private String email;

}
