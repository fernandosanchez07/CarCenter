package com.carcenter.carcenter.service.impl;

import com.carcenter.carcenter.dao.RepuestoMantenimientoDao;
import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MantenimientoEntity;
import com.carcenter.carcenter.entity.RepuestoEntity;
import com.carcenter.carcenter.entity.RepuestoMantenimientoEntity;
import com.carcenter.carcenter.exception.NotFoundException;
import com.carcenter.carcenter.service.MantenimientoService;
import com.carcenter.carcenter.service.RepuestoMantenimientoService;
import com.carcenter.carcenter.service.RepuestoService;
import com.carcenter.carcenter.validator.RepuestoExistenciaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RepuestoMantenimientoServiceImpl implements RepuestoMantenimientoService {

    @Autowired
    private RepuestoMantenimientoDao repuestoMantenimientoDao;

    @Autowired
    private MantenimientoService mantenimientoService;

    @Autowired
    private RepuestoService repuestoService;

    @Autowired
    private RepuestoExistenciaValidator repuestoExistenciaValidator;

    @Override
    public List<RepuestoMantenimientoEntity> getAll() {
        return null;
    }

    @Override
    public List<RepuestoMantenimientoEntity> getAllByCodigoMantenimiento(Integer codigo) {
        return repuestoMantenimientoDao.getAllByCodigoMantenimiento(codigo);
    }

    @Override
    public MensajeResponseDto save(RepuestoMantenimientoEntity repuestoMantenimiento) {
        Optional<MantenimientoEntity> mantenimiento =
                mantenimientoService.getFindById(repuestoMantenimiento.getCodigoMantenimiento());
        if (mantenimiento.isPresent()) {
            Optional<RepuestoEntity> repuesto =
                    repuestoService.getFindByCodigo(repuestoMantenimiento.getCodigoRepuesto().getCodigo());
            if (repuesto.isPresent()) {
                repuestoMantenimiento.setPrecioRepuesto(
                        repuesto.get().getPrecioUnitario() * repuestoMantenimiento.getUnidades());

                repuestoExistenciaValidator.validarExistencias(repuesto, repuestoMantenimiento);

                repuesto.get().setUnidadesInventario(repuesto.get().getUnidadesInventario()
                        - repuestoMantenimiento.getUnidades());
                repuestoService.update(repuesto.get());
                repuestoMantenimientoDao.save(repuestoMantenimiento);
                return new MensajeResponseDto(true, "Registro exitoso.", repuestoMantenimiento);
            }
            throw  new NotFoundException("No se encontro el repuesto.");
        }
        return new MensajeResponseDto(true, "No se encontro el mantenimiento.", repuestoMantenimiento);
    }

    @Override
    public MensajeResponseDto update(RepuestoMantenimientoEntity repuestoMantenimientoEntity) {
        return null;
    }

    @Override
    public MensajeResponseDto delete(RepuestoMantenimientoEntity repuestoMantenimientoEntity) {
        return null;
    }
}
