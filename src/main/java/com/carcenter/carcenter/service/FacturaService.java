package com.carcenter.carcenter.service;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.FacturaEntity;
import javassist.NotFoundException;

import java.util.List;

public interface FacturaService {

    List<FacturaEntity> getAll();

    MensajeResponseDto save(Integer codigo) throws NotFoundException;

    MensajeResponseDto update(FacturaEntity facturaEntity);

    FacturaEntity delete(FacturaEntity facturaEntity);
}
