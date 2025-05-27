package org.example.hotel.Repositorios;

import org.example.hotel.Entidades.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
