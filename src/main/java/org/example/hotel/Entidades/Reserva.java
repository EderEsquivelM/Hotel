package org.example.hotel.Entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idHuesped")
    private Huesped idHuesped;

    private Date fechaEntrada;
    private Date fechaSalida;
    private String estadoReserva="Pendiente";

    public Reserva() {
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Huesped getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(Huesped idHuesped) {
        this.idHuesped = idHuesped;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
