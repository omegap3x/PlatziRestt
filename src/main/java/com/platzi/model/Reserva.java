package com.platzi.model;

import java.util.Date;

public class Reserva {

    private String  idReserva;
    private Date fechaIngresoReserva;
    private Date fechaSalidaReserva;
    private int cantidadPersonasReserva;
    private String descripcionReserva;

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaIngresoReserva() {
        return fechaIngresoReserva;
    }

    public void setFechaIngresoReserva(Date fechaIngresoReserva) {
        this.fechaIngresoReserva = fechaIngresoReserva;
    }

    public Date getFechaSalidaReserva() {
        return fechaSalidaReserva;
    }

    public void setFechaSalidaReserva(Date fechaSalidaReserva) {
        this.fechaSalidaReserva = fechaSalidaReserva;
    }

    public int getCantidadPersonasReserva() {
        return cantidadPersonasReserva;
    }

    public void setCantidadPersonasReserva(int cantidadPersonasReserva) {
        this.cantidadPersonasReserva = cantidadPersonasReserva;
    }

    public String getDescripcionReserva() {
        return descripcionReserva;
    }

    public void setDescripcionReserva(String descripcionReserva) {
        this.descripcionReserva = descripcionReserva;
    }
}
