package com.carcenter.carcenter.controller;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.RepuestoEntity;
import com.carcenter.carcenter.entity.RepuestoMantenimientoEntity;
import com.carcenter.carcenter.entity.ServicioEntity;
import com.carcenter.carcenter.service.RepuestoService;
import com.carcenter.carcenter.service.ServicioService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicio")
public class ServicioController {


    @Autowired
    private ServicioService servicioService;

    @ApiOperation(value = "Permite guardar un servicio.")
    @PostMapping("/save")
    public MensajeResponseDto save(@RequestBody ServicioEntity servicioEntity) {
        return servicioService.save(servicioEntity);
    }}
