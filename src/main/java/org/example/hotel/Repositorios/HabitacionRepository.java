package org.example.hotel.Repositorios;

import org.example.hotel.Entidades.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HabitacionRepository extends JpaRepository<Habitacion, Integer> {
    List<Habitacion> findByTipoHabitacionIdTipoHabitacion(Integer idTipoHabitacion);

}
