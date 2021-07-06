package com.carcenter.carcenter.service;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.ClienteEntity;

import java.util.List;

public interface ClienteService {

    List<ClienteEntity> getAll();

    MensajeResponseDto save(ClienteEntity clienteEntity);

    MensajeResponseDto update(ClienteEntity clienteEntity);

    MensajeResponseDto deleteById(Integer id);
}
