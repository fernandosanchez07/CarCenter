package com.carcenter.carcenter.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MensajeResponseDto implements Serializable {

    private Boolean status;

    private String mensaje;

    private Object data;

}
