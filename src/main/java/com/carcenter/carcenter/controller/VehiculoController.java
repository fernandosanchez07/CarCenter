package com.carcenter.carcenter.controller;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.VehiculoEntity;
import com.carcenter.carcenter.service.VehiculoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @ApiOperation(value = "Permite guardar un vehiculo.")
    @PostMapping("/save")
    public MensajeResponseDto save(@RequestBody VehiculoEntity vehiculoEntity) {
        return vehiculoService.save(vehiculoEntity);
    }
}
