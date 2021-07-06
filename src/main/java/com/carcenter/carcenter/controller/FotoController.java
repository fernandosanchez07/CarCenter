package com.carcenter.carcenter.controller;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.FotoEntity;
import com.carcenter.carcenter.service.FotoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foto")
public class FotoController {

    @Autowired
    private FotoService fotoService;

    @ApiOperation(value = "Permite guardar una foto.")
    @PostMapping("/save")
    public MensajeResponseDto save(@RequestBody FotoEntity fotoEntity) {
        return fotoService.save(fotoEntity);
    }


}
