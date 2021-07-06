package com.carcenter.carcenter.exception;

import lombok.Data;

@Data
public class NotFoundException extends RuntimeException {

    public NotFoundException(String mensaje) {
        super(mensaje);
    }
}