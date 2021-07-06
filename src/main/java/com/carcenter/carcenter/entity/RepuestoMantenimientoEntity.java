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
@Table(name = "repuesto_mantenimiento")
public class RepuestoMantenimientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    @Column(name = "unidades")
    private int unidades;

    @Column(name = "tiempo_estimado")
    private int precioRepuesto;

    @Column(name = "cod_mantenimiento")
    private int codigoMantenimiento;

    @ManyToOne
    @JoinColumn(name = "cod_repuesto")
    private RepuestoEntity codigoRepuesto;

}
