package org.example.hotel.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ServicioAdicional {

    @Id
    private Integer idServicioAdicional;
    private String nombre;
    private double precio;

    public ServicioAdicional(Integer idServicioAdicional, String nombre, double precio) {
        this.idServicioAdicional = idServicioAdicional;
        this.nombre = nombre;
        this.precio = precio;
    }

    public ServicioAdicional() {
    }

    public Integer getIdServicioAdicional() {
        return idServicioAdicional;
    }

    public void setIdServicioAdicional(Integer idServicioAdicional) {
        this.idServicioAdicional = idServicioAdicional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
