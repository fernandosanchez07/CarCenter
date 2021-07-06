package com.carcenter.carcenter.service.impl;

import com.carcenter.carcenter.dao.MantenimientoDao;
import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MantenimientoEntity;
import com.carcenter.carcenter.service.MantenimientoService;
import com.carcenter.carcenter.service.MecanicoService;
import com.carcenter.carcenter.type.EstadoMantenimiento;
import com.carcenter.carcenter.type.EstadoMecanico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManteniemientoServiceImpl implements MantenimientoService {

    @Autowired
    private MantenimientoDao mantenimientoDao;

    @Autowired
    private MecanicoService mecanicoService;

    @Override
    public List<MantenimientoEntity> getAll() {
        return mantenimientoDao.findAll();
    }

    @Override
    public Optional<MantenimientoEntity> getFindById(Integer codigo) {
        return mantenimientoDao.findById(codigo);
    }

    @Override
    public MensajeResponseDto save(MantenimientoEntity mantenimientoEntity) {
        mantenimientoEntity.setEstado(EstadoMantenimiento.INICIADO.getValue());
        mantenimientoEntity.getDatosMecanico().setEstado(EstadoMecanico.OCUPADO.getValue());
        mecanicoService.update(mantenimientoEntity.getDatosMecanico());
        mantenimientoDao.save(mantenimientoEntity);
        return new MensajeResponseDto(true, "Registro exitoso.", mantenimientoEntity);
    }

    @Override
    public MensajeResponseDto update(MantenimientoEntity mantenimientoEntity) {
        return new MensajeResponseDto(true, "Registro exitoso.",
                mantenimientoDao.save(mantenimientoEntity));
    }

    @Override
    public MensajeResponseDto delete(MantenimientoEntity mantenimientoEntity) {
        return null;
    }

}
