package com.carcenter.carcenter.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "servicio")
public class ServicioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    @Column(name = "nombre_servicio", length = 100)
    private String nombreServicio;

    @Column(name = "preico")
    private int precio;

}
