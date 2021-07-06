package com.carcenter.carcenter.controller;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MecanicoEntity;
import com.carcenter.carcenter.service.MecanicoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mecanico")
public class MecanicoController {

    @Autowired
    private MecanicoService mecanicoService;

    @ApiOperation(value = "Permite guardar un mecanico.")
    @PostMapping("/save")
    public MensajeResponseDto save(@RequestBody MecanicoEntity mecanicoEntity) {
        return mecanicoService.save(mecanicoEntity);
    }

    @ApiOperation(value = "Permite listar 10 mecanicos libres con menores horas de trabajo.")
    @GetMapping("/mecanicos_libres")
    public MensajeResponseDto getMecanicosLibres() {
        return mecanicoService.getMecanicosLibres();
    }
}
