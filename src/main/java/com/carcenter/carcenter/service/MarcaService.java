package com.carcenter.carcenter.service;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MarcaEntity;

import java.util.List;

public interface MarcaService {

    List<MarcaEntity> getAll();

    MensajeResponseDto save(MarcaEntity marcaEntity);

    MensajeResponseDto update(MarcaEntity marcaEntity);

    MensajeResponseDto delete(MarcaEntity marcaEntity);

}
