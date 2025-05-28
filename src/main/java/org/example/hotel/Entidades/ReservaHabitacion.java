package org.example.hotel.Entidades;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class ReservaHabitacion {
    @EmbeddedId
    private ReservaHabitacionId id;

    @ManyToOne
    @MapsId("idReserva")
    @JoinColumn(name = "id_reserva")
    private Reserva idReserva;

    @ManyToOne
    @MapsId("idHabitacion")
    @JoinColumn(name = "id_habitacion")
    private Habitacion idHabitacion;

    @ManyToOne
    @JoinColumn(name = "idEmpleadoCheckin")
    private Empleado idEmpleadoCheckin;

    @ManyToOne
    @JoinColumn(name = "idEmpleadoCheckout")
    private Empleado idEmpleadoCheckout;

    private LocalDate fechaCheckin;
    private LocalDate fechaCheckout;
    private String observacionesCheckin;
    private String observacionesCheckout;

    public ReservaHabitacion() {

    }

    public ReservaHabitacionId getId() {
        return id;
    }

    public void setId(ReservaHabitacionId id) {
        this.id = id;
    }

    public Reserva getReserva() {
        return idReserva;
    }

    public void setReserva(Reserva reserva) {
        this.idReserva = reserva;
    }

    public Habitacion getHabitacion() {
        return idHabitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.idHabitacion = habitacion;
    }

    public Empleado getIdEmpleadoCheckin() {
        return idEmpleadoCheckin;
    }

    public void setIdEmpleadoCheckin(Empleado idEmpleadoCheckin) {
        this.idEmpleadoCheckin = idEmpleadoCheckin;
    }

    public Empleado getIdEmpleadoCheckout() {
        return idEmpleadoCheckout;
    }

    public void setIdEmpleadoCheckout(Empleado idEmpleadoCheckout) {
        this.idEmpleadoCheckout = idEmpleadoCheckout;
    }

    public LocalDate getFechaCheckin() {
        return fechaCheckin;
    }

    public void setFechaCheckin(LocalDate fechaCheckin) {
        this.fechaCheckin = fechaCheckin;
    }

    public LocalDate getFechaCheckout() {
        return fechaCheckout;
    }

    public void setFechaCheckout(LocalDate fechaCheckout) {
        this.fechaCheckout = fechaCheckout;
    }

    public String getObservacionesCheckin() {
        return observacionesCheckin;
    }

    public void setObservacionesCheckin(String observacionesCheckin) {
        this.observacionesCheckin = observacionesCheckin;
    }

    public String getObservacionesCheckout() {
        return observacionesCheckout;
    }

    public void setObservacionesCheckout(String observacionesCheckout) {
        this.observacionesCheckout = observacionesCheckout;
    }
}
