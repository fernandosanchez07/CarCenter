package com.carcenter.carcenter.controller;

import com.carcenter.carcenter.dao.RepuestoMantenimientoDao;
import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MecanicoEntity;
import com.carcenter.carcenter.entity.RepuestoMantenimientoEntity;
import com.carcenter.carcenter.service.RepuestoMantenimientoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repuesto_mantenimiento")
public class RepuestoMantenimientoController {

    @Autowired
    private RepuestoMantenimientoService repuestoMantenimientoService;

    @ApiOperation(value = "Permite guardar el repuesto de un mantenimiento.")
    @PostMapping("/save")
    public MensajeResponseDto save(@RequestBody RepuestoMantenimientoEntity repuestoMantenimientoEntity) {
        return repuestoMantenimientoService.save(repuestoMantenimientoEntity);
    }
}
