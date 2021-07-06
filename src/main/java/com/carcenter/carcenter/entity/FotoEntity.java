package com.carcenter.carcenter.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "fotos")
public class FotoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    @Column(name = "ruta", length = 200)
    private String ruta;

    @ManyToOne
    @JoinColumn(name = "cod_mantenimiento")
    private MantenimientoEntity codigoMantenimiento;

}

