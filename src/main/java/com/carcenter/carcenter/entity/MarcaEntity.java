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
@Table(name = "marcas")
public class MarcaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "nombre")
    private String nombreMarca;

}
