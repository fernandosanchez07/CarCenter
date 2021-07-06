package com.carcenter.carcenter.service.impl;

import com.carcenter.carcenter.dao.VehiculoDao;
import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.VehiculoEntity;
import com.carcenter.carcenter.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoDao vehiculoDao;

    @Override
    public List<VehiculoEntity> getAll() {
        return null;
    }

    @Override
    public MensajeResponseDto save(VehiculoEntity vehiculoEntity) {
        vehiculoDao.save(vehiculoEntity);
        return new MensajeResponseDto(true, "Registro exitoso.", vehiculoEntity);
    }

    @Override
    public MensajeResponseDto update(VehiculoEntity vehiculoEntity) {
        return null;
    }

    @Override
    public MensajeResponseDto delete(VehiculoEntity vehiculoEntity) {
        return null;
    }
}
