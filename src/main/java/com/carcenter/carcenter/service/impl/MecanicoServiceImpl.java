package com.carcenter.carcenter.service.impl;

import com.carcenter.carcenter.dao.MecanicoDao;
import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MecanicoEntity;
import com.carcenter.carcenter.service.MecanicoService;
import com.carcenter.carcenter.type.EstadoMecanico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class MecanicoServiceImpl implements MecanicoService {

    @Autowired
    private MecanicoDao mecanicoDao;

    @Override
    public List<MecanicoEntity> getAll() {
        return null;
    }

    @Override
    public MensajeResponseDto getMecanicosLibres() {
        List<MecanicoEntity> mecanicosLibres = mecanicoDao.findByEstado(EstadoMecanico.LIBRE.getValue());
        List<MecanicoEntity> opcionesMecanicos = new ArrayList<>();
        if (mecanicosLibres.size() > 1) {
            mecanicosLibres.sort(Comparator.comparingInt(MecanicoEntity::getHorasMes));
            int count = 0;
            while (count < 10) {
                opcionesMecanicos.add(mecanicosLibres.get(count++));
            }
        }
        return new MensajeResponseDto(true, "Registro exitoso.", opcionesMecanicos);
    }

    @Override
    public Optional<MecanicoEntity> getFindById(Integer codigo) {
        return mecanicoDao.findById(codigo);
    }

    @Override
    public List<MecanicoEntity> getFindByEstado(String estado) {
        return mecanicoDao.findByEstado(estado);
    }

    @Override
    public MensajeResponseDto save(MecanicoEntity mecanicoEntity) {
        mecanicoEntity.setEstado(EstadoMecanico.LIBRE.getValue());
        mecanicoDao.save(mecanicoEntity);
        return new MensajeResponseDto(true, "Registro exitoso.", mecanicoEntity);
    }

    @Override
    public MensajeResponseDto update(MecanicoEntity mecanicoEntity) {
        mecanicoDao.save(mecanicoEntity);
        return new MensajeResponseDto(true, "Registro exitoso.", mecanicoEntity);
    }

    @Override
    public MensajeResponseDto delete(MecanicoEntity mecanicoEntity) {
        return null;
    }
}
