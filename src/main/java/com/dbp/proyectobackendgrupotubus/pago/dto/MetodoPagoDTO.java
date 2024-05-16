package com.dbp.proyectobackendgrupotubus.pago.dto;

public class MetodoPagoDTO {
    String tipo;

    public MetodoPagoDTO(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
