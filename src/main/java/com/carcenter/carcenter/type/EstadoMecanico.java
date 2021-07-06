package com.carcenter.carcenter.type;

import com.carcenter.carcenter.exception.InvalidEnumException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EstadoMecanico {

    LIBRE,
    OCUPADO;

    private EstadoMecanico() {
    }

    @JsonValue
    public String getValue() {
        return this.name();
    }

    @JsonCreator
    public static EstadoMecanico fromValue(String value) {
        if (value != null && value.isEmpty()) {
            return null;
        } else {
            EstadoMecanico[] var1 =values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                EstadoMecanico p = var1[var3];
                if (p.name().equals(value)) {
                    return p;
                }
            }

            throw new InvalidEnumException("Estado", value);
        }
    }
}
