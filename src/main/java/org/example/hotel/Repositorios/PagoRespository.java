package org.example.hotel.Repositorios;

import org.example.hotel.Entidades.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRespository extends JpaRepository<Pago, Integer> {
}
