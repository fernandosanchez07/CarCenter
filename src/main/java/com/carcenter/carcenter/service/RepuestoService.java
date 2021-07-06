package com.carcenter.carcenter.service;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.RepuestoEntity;

import java.util.List;
import java.util.Optional;

public interface RepuestoService {

    List<RepuestoEntity> getAll();

    Optional<RepuestoEntity> getFindByCodigo(Integer Cogidigo);

    MensajeResponseDto save(RepuestoEntity repuestoEntity);

    MensajeResponseDto update(RepuestoEntity repuestoEntity);

    MensajeResponseDto delete(RepuestoEntity repuestoEntity);

}
