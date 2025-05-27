package org.example.hotel.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class TipoEmpleado {
    @Id
    private int idTipoEmpleado;

    private String nombre;

    public TipoEmpleado(int idTipoEmpleado, String nombre) {
        this.idTipoEmpleado = idTipoEmpleado;
        this.nombre = nombre;
    }

    public TipoEmpleado() {
    }

    public int getIdEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idTipoEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
