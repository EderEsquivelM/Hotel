package org.example.hotel.Repositorios;

import org.example.hotel.Entidades.ReservaHabitacion;
import org.example.hotel.Entidades.ReservaHabitacionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaHabitacionRepository extends JpaRepository<ReservaHabitacion, ReservaHabitacionId> {
}
