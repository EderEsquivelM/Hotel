package org.example.hotel.Entidades;

import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vw_habitacionesdisponibles")
public class vwHabitacionesDisponibles {

    @Id
    @Column(name = "id_habitacion")
    private Integer idHabitacion;

    @Column(name = "numero")
    private String numero;

    @Column(name = "piso")
    private String piso;

    @Column(name = "disponible")
    private String disponible;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "capacidad")
    private Integer capacidad;

    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
}