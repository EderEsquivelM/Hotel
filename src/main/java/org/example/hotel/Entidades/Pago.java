package org.example.hotel.Entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPago;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idReserva")
    private Reserva idReserva;

    private Date fechaPago;
    private double monto;
    private String metodoPago;
    private String statusPago="N";

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idTarjeta")
    private Tarjeta idTarjeta;

    public Pago() {
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getStatusPago() {
        return statusPago;
    }

    public void setStatusPago(String statusPago) {
        this.statusPago = statusPago;
    }

    public Tarjeta getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Tarjeta idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public Reserva getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Reserva idReserva) {
        this.idReserva = idReserva;
    }
}
