package com.carcenter.carcenter.controller;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.MarcaEntity;
import com.carcenter.carcenter.service.MarcaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marca")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @ApiOperation(value = "Permite guardar una marca.")
    @PostMapping("/save")
    public MensajeResponseDto save(@RequestBody MarcaEntity marcaEntity) {
        return marcaService.save(marcaEntity);
    }
}
