package org.example.hotel.Repositorios;

import org.example.hotel.Entidades.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitacionRepository extends JpaRepository<Habitacion, Integer> {
}
