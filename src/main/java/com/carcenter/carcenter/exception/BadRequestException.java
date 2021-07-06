package com.carcenter.carcenter.exception;

import lombok.Data;

@Data
public class BadRequestException extends RuntimeException {

    public BadRequestException(String mensaje) {
        super(mensaje);
    }
}
