package com.carcenter.carcenter.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "vehiculo")
public class VehiculoEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Id
    @Column(name = "placa", length = 6)
    private String placa;

    @Column(name = "color", length = 30)
    private String color;

    @ManyToOne
    @JoinColumn(name = "cod_marca")
    private MarcaEntity codigoMarca;

    @ManyToOne
    @JoinColumn(name = "cli_documento", referencedColumnName = "documento")
    private ClienteEntity datosCliente;

}
