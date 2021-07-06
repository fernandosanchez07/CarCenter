package com.carcenter.carcenter.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Entity
@Table(name = "mantenimientos")
public class MantenimientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_registro", nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaRegistro;

    @Column(name = "limite_mantenimiento")
    private int limiteMantenimiento;

    @ManyToOne
    @JoinColumn(name = "codigo_placa")
    private VehiculoEntity codigoPlaca;

    @ManyToOne
    @JoinColumn(name = "mec_documento", referencedColumnName = "documento")
    private MecanicoEntity datosMecanico;

    @JoinColumn(name = "mec_tipo_documento", referencedColumnName = "tipo_documento")
    private String tipoDocumentoMecanico;


}
