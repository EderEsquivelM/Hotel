package org.example.hotel.Entidades;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class ReservaHabitacionId {
    private Integer idReserva;
    private Integer idHabitacion;

    public ReservaHabitacionId() {

    }

    public ReservaHabitacionId(Integer idReserva, Integer idHabitacion) {
        this.idReserva = idReserva;
        this.idHabitacion = idHabitacion;
    }

    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReservaHabitacionId that)) return false;
        return Objects.equals(idReserva, that.idReserva) &&
                Objects.equals(idHabitacion, that.idHabitacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReserva, idHabitacion);
    }

}
