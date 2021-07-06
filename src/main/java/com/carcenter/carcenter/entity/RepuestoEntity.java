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
@Table(name = "repuesto")
public class RepuestoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    @Column(name = "nombre_repuesto", length = 100)
    private String nombreRepuesto;

    @Column(name = "precio_unitario")
    private int precioUnitario;

    @Column(name = "unidades_inventario")
    private int unidadesInventario;

    @Column(name = "proveedor", length = 300)
    private String proveedor;

}
