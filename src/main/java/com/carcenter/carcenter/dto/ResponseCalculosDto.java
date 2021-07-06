package com.carcenter.carcenter.dto;

import com.carcenter.carcenter.entity.RepuestoMantenimientoEntity;
import com.carcenter.carcenter.entity.ServicioMantenimientoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCalculosDto implements Serializable {

    private int valor;

    private List<RepuestoMantenimientoEntity> repuestosMantenimiento;

    private List<ServicioMantenimientoEntity> serviciosMantenimiento;
}
