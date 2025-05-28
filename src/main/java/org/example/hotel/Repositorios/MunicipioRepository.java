package org.example.hotel.Repositorios;

import org.example.hotel.Entidades.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {

    @Query("SELECT m FROM Municipio m WHERE LOWER(m.idEstado.nombre) = :nombreEstado")
    List<Municipio> findByNombreEstado(@Param("nombreEstado") String nombreEstado);

}
