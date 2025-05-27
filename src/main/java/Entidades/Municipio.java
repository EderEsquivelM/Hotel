package Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Municipio {
    @Id
    private Integer idMunicipio;

    @ManyToOne
    @JoinColumn(name = "idEstado")
    private Estado idEstado;

    private String nombre;

    public Municipio(Integer idMunicipio, Estado idEstado, String nombre) {
        this.idMunicipio = idMunicipio;
        this.idEstado = idEstado;
        this.nombre = nombre;
    }

    public Municipio() {
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estado idEstado) {
        this.idEstado = idEstado;
    }
}
