package com.carcenter.carcenter.service.impl;

import com.carcenter.carcenter.dao.MarcaDao;
import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MarcaEntity;
import com.carcenter.carcenter.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImpl implements MarcaService {

    @Autowired
    private MarcaDao marcaDao;

    @Override
    public List<MarcaEntity> getAll() {
        return marcaDao.findAll();
    }

    @Override
    public MensajeResponseDto save(MarcaEntity marcaEntity) {
        marcaDao.save(marcaEntity);
        return new MensajeResponseDto(true, "Registro exitoso.", marcaEntity);
    }

    @Override
    public MensajeResponseDto update(MarcaEntity marcaEntity) {
        return null;
    }

    @Override
    public MensajeResponseDto delete(MarcaEntity marcaEntity) {
        return null;
    }
}
