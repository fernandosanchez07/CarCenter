package com.carcenter.carcenter.controller;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MantenimientoEntity;
import com.carcenter.carcenter.entity.MecanicoEntity;
import com.carcenter.carcenter.service.MantenimientoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mantenimiento")
public class MantenimientoController {

    @Autowired
    private MantenimientoService mantenimientoService;

    @ApiOperation(value = "Permite guardar un mantenimiento.")
    @PostMapping("/save")
    public MensajeResponseDto save(@RequestBody MantenimientoEntity mantenimientoEntity) {
        return mantenimientoService.save(mantenimientoEntity);
    }

    @ApiOperation(value = "Permite listar todos los manteniminetos.")
    @GetMapping("/getAll")
    public List<MantenimientoEntity> getAll() {
        return mantenimientoService.getAll();
    }

}
