package com.carcenter.carcenter.controller;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MecanicoEntity;
import com.carcenter.carcenter.entity.RepuestoEntity;
import com.carcenter.carcenter.service.RepuestoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/repuesto")
public class RepuestoController {

    @Autowired
    private RepuestoService repuestoService;

    @ApiOperation(value = "Permite guardar un repuesto.")
    @PostMapping("/save")
    public MensajeResponseDto save(@RequestBody RepuestoEntity repuestoEntity) {
        return repuestoService.save(repuestoEntity);
    }

    @ApiOperation(value = "Permite guardar un repuesto.")
    @GetMapping("/getAll")
    public List<RepuestoEntity> getAll() {
        return repuestoService.getAll();
    }

}
