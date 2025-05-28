package org.example.hotel.Entidades;

import jakarta.persistence.*;

@Entity
public class ReservaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservaDetalle;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "id_reserva", referencedColumnName = "id_reserva"),
            @JoinColumn(name = "id_habitacion", referencedColumnName = "id_habitacion")
    })
    private ReservaHabitacion reservaHabitacion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idHuesped")
    private Huesped idHuesped;

    private boolean esResponsable=false;

    public ReservaDetalle() {
    }

    public Integer getIdReservaDetalle() {
        return idReservaDetalle;
    }

    public void setIdReservaDetalle(Integer idReservaDetalle) {
        this.idReservaDetalle = idReservaDetalle;
    }

    public ReservaHabitacion getReservaHabitacion() {
        return reservaHabitacion;
    }

    public void setReservaHabitacion(ReservaHabitacion reservaHabitacion) {
        this.reservaHabitacion = reservaHabitacion;
    }

    public Huesped getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(Huesped idHuesped) {
        this.idHuesped = idHuesped;
    }

    public boolean isEsResponsable() {
        return esResponsable;
    }

    public void setEsResponsable(boolean esResponsable) {
        this.esResponsable = esResponsable;
    }
}
