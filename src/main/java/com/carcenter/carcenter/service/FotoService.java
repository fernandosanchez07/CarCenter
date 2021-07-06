package com.carcenter.carcenter.service;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.ClienteEntity;
import com.carcenter.carcenter.entity.FotoEntity;

import java.util.List;

public interface FotoService {

    List<FotoEntity> getAll();

    MensajeResponseDto save(FotoEntity fotoEntity);

    MensajeResponseDto update(FotoEntity fotoEntity);

    MensajeResponseDto delete(FotoEntity fotoEntity);

}
