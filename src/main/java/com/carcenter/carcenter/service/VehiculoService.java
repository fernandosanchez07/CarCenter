package com.carcenter.carcenter.service;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.VehiculoEntity;

import java.util.List;

public interface VehiculoService {

    List<VehiculoEntity> getAll();

    MensajeResponseDto save(VehiculoEntity vehiculoEntity);

    MensajeResponseDto update(VehiculoEntity vehiculoEntity);

    MensajeResponseDto delete(VehiculoEntity vehiculoEntity);
}
