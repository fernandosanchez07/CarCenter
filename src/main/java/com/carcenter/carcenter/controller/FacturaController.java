package com.carcenter.carcenter.controller;

import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.entity.FacturaEntity;
import com.carcenter.carcenter.service.FacturaService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @PostMapping("/generarFacutra/{codigo}")
    public MensajeResponseDto generarFactura(@PathVariable("codigo") Integer codigo) throws NotFoundException {
        return facturaService.save(codigo);
    }

    @GetMapping("/listarFacturas")
    public List<FacturaEntity> getAll() {
        return facturaService.getAll();
    }

    @PutMapping("/actualizarFactura")
    public MensajeResponseDto generarFactura(@RequestBody FacturaEntity factura) {
        return facturaService.update(factura);
    }

}
