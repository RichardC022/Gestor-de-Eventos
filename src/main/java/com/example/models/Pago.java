package com.example.models;

import java.util.Date;

public class Pago {
    private int id;
    private int reservaId;
    private Date fechaPago;
    private float monto;
    private String estadoPago;
    private TipoPago tipoPago; // Relación con el enum TipoPago
    private Reserva reserva; // Relación con Reserva

    public Pago(int id, int reservaId, Date fechaPago, float monto, String estadoPago, TipoPago tipoPago, Reserva reserva) {
        this.id = id;
        this.reservaId = reservaId;
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.estadoPago = estadoPago;
        this.tipoPago = tipoPago;
        this.reserva = reserva;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReservaId() {
        return reservaId;
    }

    public void setReservaId(int reservaId) {
        this.reservaId = reservaId;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
