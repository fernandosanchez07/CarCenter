package com.carcenter.carcenter.controller;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.ClienteEntity;
import com.carcenter.carcenter.service.ClienteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @ApiOperation(value = "Permite guardar un cliente.")
    @PostMapping("/save")
    public MensajeResponseDto save(@RequestBody ClienteEntity clienteEntity) {
        return clienteService.save(clienteEntity);
    }

    @ApiOperation(value = "Permite actualizar un cliente.")
    @PostMapping("/getAll")
    public MensajeResponseDto getAll() {
        return new MensajeResponseDto(true, "Consulta exitosa.",clienteService.getAll());
    }

    @ApiOperation(value = "Permite actualizar un cliente.")
    @PostMapping("/update")
    public MensajeResponseDto update(@RequestBody ClienteEntity clienteEntity) {
        return clienteService.update(clienteEntity);
    }

    @ApiOperation(value = "Permite borrar un cliente, por id.")
    @PostMapping("/delete/{id}")
    public MensajeResponseDto update(@PathVariable Integer id) {
        return clienteService.deleteById(id);
    }

}
