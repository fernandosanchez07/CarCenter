package com.carcenter.carcenter.service;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.ServicioMantenimientoEntity;

import java.util.List;

public interface ServicioMantenimientoService {

    List<ServicioMantenimientoEntity> getAll();

    List<ServicioMantenimientoEntity> getAllByCodigoMantenimiento(Integer codigo);

    MensajeResponseDto save(ServicioMantenimientoEntity servicioMantenimientoEntity);

    MensajeResponseDto update(ServicioMantenimientoEntity servicioMantenimientoEntity);

    MensajeResponseDto delete(ServicioMantenimientoEntity servicioMantenimientoEntity);

}
