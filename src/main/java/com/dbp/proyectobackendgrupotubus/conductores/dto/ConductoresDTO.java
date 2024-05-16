package com.dbp.proyectobackendgrupotubus.conductores.dto;

public class ConductoresDTO {
    String nombreDTO;
    String apellidoDTO;

    String correo;
    String licencia;

    public ConductoresDTO(String nombreDTO, String apellidoDTO, String correo, String licencia) {
        this.nombreDTO = nombreDTO;
        this.apellidoDTO = apellidoDTO;
        this.correo = correo;
        this.licencia = licencia;
    }

    public ConductoresDTO(){

    }

    public String getNombreDTO() {
        return nombreDTO;
    }

    public void setNombreDTO(String nombreDTO) {
        this.nombreDTO = nombreDTO;
    }

    public String getApellidoDTO() {
        return apellidoDTO;
    }

    public void setApellidoDTO(String apellidoDTO) {
        this.apellidoDTO = apellidoDTO;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

}
