package com.carcenter.carcenter.service.impl;

import com.carcenter.carcenter.dao.FotoDao;
import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.FotoEntity;
import com.carcenter.carcenter.service.FotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FotoServiceImpl implements FotoService {

    @Autowired
    private FotoDao fotoDao;

    @Override
    public List<FotoEntity> getAll() {
        return null;
    }

    @Override
    public MensajeResponseDto save(FotoEntity fotoEntity) {
        fotoDao.save(fotoEntity);
        return new MensajeResponseDto(true, "Registro exitoso.", fotoEntity);
    }

    @Override
    public MensajeResponseDto update(FotoEntity fotoEntity) {
        return null;
    }

    @Override
    public MensajeResponseDto delete(FotoEntity fotoEntity) {
        return null;
    }
}
