package com.carcenter.carcenter.dto;

import com.carcenter.carcenter.entity.RepuestoMantenimientoEntity;
import com.carcenter.carcenter.entity.ServicioMantenimientoEntity;
import lombok.Data;

import java.util.List;

@Data
public class FacturaDto {

    private int codigo;

    private String repuestos;

    private int totalRepuestos;

    private String servicios;

    private int totalServicios;

    private int totalPagar;

    private List<RepuestoMantenimientoEntity> respuestoMantenimiento;

    private List<ServicioMantenimientoEntity> servicioMantenimientoEntity;
}
