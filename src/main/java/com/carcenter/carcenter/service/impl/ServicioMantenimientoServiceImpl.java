package com.carcenter.carcenter.service.impl;

import com.carcenter.carcenter.dao.ServicioMantenimientoDao;
import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MantenimientoEntity;
import com.carcenter.carcenter.entity.MecanicoEntity;
import com.carcenter.carcenter.entity.ServicioMantenimientoEntity;
import com.carcenter.carcenter.service.MantenimientoService;
import com.carcenter.carcenter.service.MecanicoService;
import com.carcenter.carcenter.service.ServicioMantenimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioMantenimientoServiceImpl implements ServicioMantenimientoService {

    @Autowired
    private ServicioMantenimientoDao servicioMantenimientoDao;

    @Autowired
    private MecanicoService mecanicoService;

    @Autowired
    private MantenimientoService mantenimientoService;

    @Override
    public List<ServicioMantenimientoEntity> getAll() {
        return null;
    }

    @Override
    public List<ServicioMantenimientoEntity> getAllByCodigoMantenimiento(Integer codigo) {
        return servicioMantenimientoDao.findByCodigoMantenimiento(codigo);
    }

    @Override
    public MensajeResponseDto save(ServicioMantenimientoEntity servicioMantenimientoEntity) {
        Optional<MantenimientoEntity> mantenimiento =
                mantenimientoService.getFindById(servicioMantenimientoEntity.getCodigoMantenimiento());
        if (mantenimiento.isPresent()) {
            Optional<MecanicoEntity> mecanico =
                    mecanicoService.getFindById(mantenimiento.get().getDatosMecanico().getDocumento());
            if (mecanico.isPresent()) {
                MecanicoEntity mecanicoEntity = mecanico.get();
                mecanicoEntity.setHorasMes(servicioMantenimientoEntity.getTiempoEstimado());
                mecanicoService.update(mecanicoEntity);
            }
        }
        servicioMantenimientoDao.save(servicioMantenimientoEntity);
        return new MensajeResponseDto(true, "Registro exitoso.", servicioMantenimientoEntity);
    }

    @Override
    public MensajeResponseDto update(ServicioMantenimientoEntity servicioMantenimientoEntity) {
        return null;
    }

    @Override
    public MensajeResponseDto delete(ServicioMantenimientoEntity servicioMantenimientoEntity) {
        return null;
    }
}
