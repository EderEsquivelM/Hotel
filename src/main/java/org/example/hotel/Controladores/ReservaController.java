package org.example.hotel.Controladores;

import org.example.hotel.Entidades.Reserva;
import org.example.hotel.Entidades.Tarjeta;
import org.example.hotel.Repositorios.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/reserva")
public class ReservaController {
    @Autowired
    private ReservaRepository reservaRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Reserva> getReservas() {
        return reservaRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Reserva getReserva(@PathVariable("id") Integer id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "")
    public @ResponseBody String addReserva(@RequestBody Reserva reservan) {
        reservaRepository.save(reservan);
        return "Tarjeta agregada con exito";
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updateReserva(@PathVariable("id") Integer id, @RequestBody Reserva reservaA) {
        Reserva reservaVieja = reservaRepository.getReferenceById(id);

        reservaVieja.setFechaEntrada(reservaA.getFechaEntrada());
        reservaVieja.setFechaSalida(reservaA.getFechaSalida());
        reservaVieja.setEstadoReserva(reservaA.getEstadoReserva());
        reservaVieja.setIdHuesped(reservaA.getIdHuesped());

        reservaRepository.save(reservaVieja);
        return "Reserva actualizada con éxito";
    }

}
