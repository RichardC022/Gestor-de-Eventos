package com.example.models;

import java.util.Date;

public class Reserva {
    private int id;
    private int eventoId;
    private int usuarioId;
    private int cantidadEntradas;
    private Date fechaReserva;
    private boolean estado;
    private EventoPrivado eventoPrivado;

    public Reserva(int id, int eventoId, int usuarioId, int cantidadEntradas, Date fechaReserva, boolean estado, EventoPrivado eventoPrivado){
        this.id = id;
        this.eventoId = eventoId;
        this.usuarioId = usuarioId;
        this.cantidadEntradas = cantidadEntradas;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
        this.eventoPrivado = eventoPrivado;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getEventoId() {
        return eventoId;
    }
    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }
    public int getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
    public int getCantidadEntradas() {
        return cantidadEntradas;
    }
    public void setCantidadEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }
    public Date getFechaReserva() {
        return fechaReserva;
    }
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public EventoPrivado getEventoPrivado() {
        return eventoPrivado;
    }
    public void setEventoPrivado(EventoPrivado eventoPrivado) {
        this.eventoPrivado = eventoPrivado;
    }

}
