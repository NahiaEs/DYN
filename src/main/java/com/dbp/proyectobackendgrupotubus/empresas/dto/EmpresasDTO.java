package com.dbp.proyectobackendgrupotubus.empresas.dto;

import com.dbp.proyectobackendgrupotubus.buses.dto.BusDTO;
import com.dbp.proyectobackendgrupotubus.conductores.dto.ConductoresDTO;

import java.util.List;

public class EmpresasDTO {
    private String ruc;
    private String nombre;
    private String descripcion;

    List<ConductoresDTO> dtoConductors;

    List<BusDTO> dtoBuses;

    public EmpresasDTO(){};

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public List<ConductoresDTO> getDtoConductors() {
        return dtoConductors;
    }

    public void setDtoConductors(List<ConductoresDTO> dtoConductors) {
        this.dtoConductors = dtoConductors;
    }

    public List<BusDTO> getDtoBuses() {
        return dtoBuses;
    }

    public void setDtoBuses(List<BusDTO> dtoBuses) {
        this.dtoBuses = dtoBuses;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
