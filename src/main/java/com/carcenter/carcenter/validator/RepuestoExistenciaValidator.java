package com.carcenter.carcenter.validator;

import com.carcenter.carcenter.entity.RepuestoEntity;
import com.carcenter.carcenter.entity.RepuestoMantenimientoEntity;
import com.carcenter.carcenter.exception.BadRequestException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RepuestoExistenciaValidator {


    public void validarExistencias(Optional<RepuestoEntity> repuesto,
                                   RepuestoMantenimientoEntity repuestoMantenimiento) {
        if (repuesto.get().getUnidadesInventario() < repuestoMantenimiento.getUnidades()) {
            throw new BadRequestException("El producto no tiene suficientes exitencias.");
        }
    }
}
