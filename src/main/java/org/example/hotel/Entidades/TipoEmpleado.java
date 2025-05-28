package org.example.hotel.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class TipoEmpleado {
    @Id
    private int idTipoEmpleado;

    private String nombre;



    public int getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(int idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
