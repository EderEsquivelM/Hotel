package org.example.hotel.Repositorios;

import org.example.hotel.Entidades.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {

}
