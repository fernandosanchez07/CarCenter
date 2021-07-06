package com.carcenter.carcenter.service;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.ServicioEntity;

import java.util.List;

public interface ServicioService {

    List<ServicioEntity> getAll();

    MensajeResponseDto save(ServicioEntity servicioEntity);

    MensajeResponseDto update(ServicioEntity servicioEntity);

    MensajeResponseDto delete(ServicioEntity servicioEntity);

}
