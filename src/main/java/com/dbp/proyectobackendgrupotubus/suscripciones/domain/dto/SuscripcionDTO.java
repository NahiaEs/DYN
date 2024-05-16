package com.dbp.proyectobackendgrupotubus.suscripciones.domain.dto;

import com.dbp.proyectobackendgrupotubus.pago.dto.PagoDTO;
import com.dbp.proyectobackendgrupotubus.pasajeros.dto.PasajerosDTO;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class SuscripcionDTO {
    Date fechaInicio;
    Date fechaFin;

    Set<HistorialDePreciosDTO> historialPrecios;

    Set<BeneficioDTO> beneficioDTO;

    PagoDTO pagos;

    List<PasajerosDTO> pasajerosLista;
}
