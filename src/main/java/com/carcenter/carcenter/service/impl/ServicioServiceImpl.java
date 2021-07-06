package com.carcenter.carcenter.service.impl;

import com.carcenter.carcenter.dao.ServicioDao;
import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.ServicioEntity;
import com.carcenter.carcenter.service.MecanicoService;
import com.carcenter.carcenter.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioDao servicioDao;

    @Override
    public List<ServicioEntity> getAll() {
        return null;
    }

    @Override
    public MensajeResponseDto save(ServicioEntity servicioEntity) {
        servicioDao.save(servicioEntity);
        return new MensajeResponseDto(true, "Registro exitoso.", servicioEntity);
    }

    @Override
    public MensajeResponseDto update(ServicioEntity servicioEntity) {
        return null;
    }

    @Override
    public MensajeResponseDto delete(ServicioEntity servicioEntity) {
        return null;
    }
}
