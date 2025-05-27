package org.example.hotel.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class TipoHabitacion {
    @Id
    private Integer idTipoHabitacion;
    private String nombre;
    private double precioNoche;
    private Integer capacidad;
    private Integer totalDisponibles;

    public TipoHabitacion(Integer idTipoHabitacion, String nombre, double precioNoche, Integer capacidad, Integer totalDisponibles) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.nombre = nombre;
        this.precioNoche = precioNoche;
        this.capacidad = capacidad;
        this.totalDisponibles = totalDisponibles;
    }

    public TipoHabitacion() {
    }

    public Integer getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(Integer idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getTotalDisponibles() {
        return totalDisponibles;
    }

    public void setTotalDisponibles(Integer totalDisponibles) {
        this.totalDisponibles = totalDisponibles;
    }
}
