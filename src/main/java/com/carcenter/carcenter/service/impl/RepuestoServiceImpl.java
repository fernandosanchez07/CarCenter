package com.carcenter.carcenter.service.impl;

import com.carcenter.carcenter.dao.RepuestoDao;
import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.RepuestoEntity;
import com.carcenter.carcenter.service.RepuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RepuestoServiceImpl implements RepuestoService {

    @Autowired
    private RepuestoDao repuestoDao;

    @Override
    public List<RepuestoEntity> getAll() {
        return repuestoDao.findAll();
    }

    @Override
    public Optional<RepuestoEntity> getFindByCodigo(Integer codigo) {
        return repuestoDao.getFindByCodigo(codigo);
    }

    @Override
    public MensajeResponseDto save(RepuestoEntity repuestoEntity) {
        repuestoDao.save(repuestoEntity);
        return new MensajeResponseDto(true, "Registro exitoso.", repuestoEntity);
    }

    @Override
    public MensajeResponseDto update(RepuestoEntity repuestoEntity) {
        return null;
    }

    @Override
    public MensajeResponseDto delete(RepuestoEntity repuestoEntity) {
        return null;
    }
}
