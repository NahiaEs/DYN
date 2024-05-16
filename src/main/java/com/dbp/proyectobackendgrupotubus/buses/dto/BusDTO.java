package com.dbp.proyectobackendgrupotubus.buses.dto;

public class BusDTO {
    private String placa;
    private String capacidad;


    public BusDTO(String placa, String capacidad) {
        this.placa = placa;
        this.capacidad = capacidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

}
