package com.carcenter.carcenter.service;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MantenimientoEntity;

import java.util.List;
import java.util.Optional;

public interface MantenimientoService {

    List<MantenimientoEntity> getAll();

    Optional<MantenimientoEntity> getFindById(Integer codigo);

    MensajeResponseDto save(MantenimientoEntity mantenimientoEntity);

    MensajeResponseDto update(MantenimientoEntity mantenimientoEntity);

    MensajeResponseDto delete(MantenimientoEntity mantenimientoEntity);

}
