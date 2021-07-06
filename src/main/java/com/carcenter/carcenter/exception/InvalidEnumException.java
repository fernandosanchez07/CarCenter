package com.carcenter.carcenter.exception;

public class InvalidEnumException extends RuntimeException{

    private String field;
    private String value;

    public InvalidEnumException(String field, String value) {
        this.field = field;
        this.value = value;
    }

    public String getField() {
        return this.field;
    }

    public String getValue() {
        return this.value;
    }
}


