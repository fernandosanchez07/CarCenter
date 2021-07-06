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
@Table(name = "servicio_mantenimiento")
public class ServicioMantenimientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    @Column(name = "codigo_mantenimiento")
    private int codigoMantenimiento;

    @Column(name = "tiempo_estimado")
    private int tiempoEstimado;

    @ManyToOne
    @JoinColumn(name = "codigo_servicio")
    private ServicioEntity codgigoServicio;



}
