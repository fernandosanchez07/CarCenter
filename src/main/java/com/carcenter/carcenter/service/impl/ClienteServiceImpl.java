package com.carcenter.carcenter.service.impl;

import com.carcenter.carcenter.dao.ClienteDao;
import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.ClienteEntity;
import com.carcenter.carcenter.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<ClienteEntity> getAll() {
        return clienteDao.findAll();
    }

    @Override
    public MensajeResponseDto save(ClienteEntity clienteEntity) {
        clienteDao.save(clienteEntity);
        return new MensajeResponseDto(true, "Registro exitoso.", clienteEntity);
    }

    @Override
    public MensajeResponseDto update(ClienteEntity clienteEntity) {
        return new MensajeResponseDto(true, "Registro actualizado.", clienteEntity);
    }

    @Override
    public MensajeResponseDto deleteById(Integer id) {
        clienteDao.deleteById(id);
        return new MensajeResponseDto(true, "Registro actualizado.", null);
    }
}
