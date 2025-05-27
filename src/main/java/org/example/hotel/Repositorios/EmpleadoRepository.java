package org.example.hotel.Repositorios;

import org.example.hotel.Entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
