package com.carcenter.carcenter.validator;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.FacturaEntity;
import com.carcenter.carcenter.entity.MantenimientoEntity;
import com.carcenter.carcenter.exception.BadRequestException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LimiteMantenimientoValidator {

    public void validarLimite(int valorTotal, Optional<MantenimientoEntity> mantenimiento,
                                            FacturaEntity facturaEntity) {
        if (mantenimiento.get().getLimiteMantenimiento() > 0) {
            if (valorTotal > mantenimiento.get().getLimiteMantenimiento()) {
                facturaEntity.setTotalPagar(valorTotal);
                throw new BadRequestException("El valor total supera el limite establecido pór el cliente");
            }
        }
    }
}
