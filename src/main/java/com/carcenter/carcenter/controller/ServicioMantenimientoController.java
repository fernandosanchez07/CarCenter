package com.carcenter.carcenter.controller;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.ServicioMantenimientoEntity;
import com.carcenter.carcenter.service.ServicioMantenimientoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicio_mantenimiento")
public class ServicioMantenimientoController {

    @Autowired
    private ServicioMantenimientoService servicioMantenimientoService;

    @ApiOperation(value = "Permite guardar el servicio por mantenimiento.")
    @PostMapping("/save")
    public MensajeResponseDto save(@RequestBody ServicioMantenimientoEntity servicioMantenimientoEntity) {
        return servicioMantenimientoService.save(servicioMantenimientoEntity);
    }

}

