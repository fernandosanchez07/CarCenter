package com.carcenter.carcenter.service;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.RepuestoMantenimientoEntity;

import java.util.List;
import java.util.Optional;

public interface RepuestoMantenimientoService {

    List<RepuestoMantenimientoEntity> getAll();

    List<RepuestoMantenimientoEntity> getAllByCodigoMantenimiento(Integer codigo);

    MensajeResponseDto save(RepuestoMantenimientoEntity repuestoMantenimientoEntity);

    MensajeResponseDto update(RepuestoMantenimientoEntity repuestoMantenimientoEntity);

    MensajeResponseDto delete(RepuestoMantenimientoEntity repuestoMantenimientoEntity);

}
