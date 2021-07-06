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
@Table(name = "facturas")
public class FacturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    private String repuestos;

    @Column(name = "total_repuestos")
    private int totalRepuestos;

    private String servicios;

    @Column(name = "total_servicios")
    private int totalServicios;

    @Column(name = "total_pagar")
    private int totalPagar;
}
