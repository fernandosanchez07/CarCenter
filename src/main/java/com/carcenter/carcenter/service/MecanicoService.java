package com.carcenter.carcenter.service;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MecanicoEntity;

import java.util.List;
import java.util.Optional;

public interface MecanicoService {

    List<MecanicoEntity> getAll();

    MensajeResponseDto getMecanicosLibres();

    Optional<MecanicoEntity> getFindById(Integer codigo);

    List<MecanicoEntity> getFindByEstado(String estado);

    MensajeResponseDto save(MecanicoEntity mecanicoEntity);

    MensajeResponseDto update(MecanicoEntity mecanicoEntity);

    MensajeResponseDto delete(MecanicoEntity mecanicoEntity);

}
