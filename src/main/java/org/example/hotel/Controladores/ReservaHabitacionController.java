package org.example.hotel.Controladores;

import org.example.hotel.Entidades.ReservaHabitacion;
import org.example.hotel.Entidades.ReservaHabitacionId;
import org.example.hotel.Repositorios.ReservaHabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/reservahabitacion")
public class ReservaHabitacionController {

    @Autowired
    private ReservaHabitacionRepository reservaHabitacionRepository;

    @GetMapping("")
    public Iterable<ReservaHabitacion> getAll() {
        return reservaHabitacionRepository.findAll();
    }


    @GetMapping("/{idReserva}/{idHabitacion}")
    public ReservaHabitacion getById(
            @PathVariable Integer idReserva,
            @PathVariable Integer idHabitacion) {
        ReservaHabitacionId id = new ReservaHabitacionId(idReserva, idHabitacion);
        return reservaHabitacionRepository.findById(id).orElse(null);
    }

    @PostMapping("")
    public String add(@RequestBody ReservaHabitacion reservaHabitacion) {
        reservaHabitacionRepository.save(reservaHabitacion);
        return "ReservaHabitacion agregada con éxito";
    }

    @PutMapping("/{idReserva}/{idHabitacion}")
    public String update(
            @PathVariable Integer idReserva,
            @PathVariable Integer idHabitacion,
            @RequestBody ReservaHabitacion reservaHabitacion) {

        ReservaHabitacionId id = new ReservaHabitacionId(idReserva, idHabitacion);
        ReservaHabitacion existente = reservaHabitacionRepository.getReferenceById(id);

        existente.setFechaCheckin(reservaHabitacion.getFechaCheckin());
        existente.setFechaCheckout(reservaHabitacion.getFechaCheckout());
        existente.setObservacionesCheckin(reservaHabitacion.getObservacionesCheckin());
        existente.setObservacionesCheckout(reservaHabitacion.getObservacionesCheckout());
        existente.setIdEmpleadoCheckin(reservaHabitacion.getIdEmpleadoCheckin());
        existente.setIdEmpleadoCheckout(reservaHabitacion.getIdEmpleadoCheckout());

        reservaHabitacionRepository.save(existente);
        return "ReservaHabitacion actualizada con éxito";
    }

    @DeleteMapping("/{idReserva}/{idHabitacion}")
    public String delete(
            @PathVariable Integer idReserva,
            @PathVariable Integer idHabitacion) {

        ReservaHabitacionId id = new ReservaHabitacionId(idReserva, idHabitacion);
        reservaHabitacionRepository.deleteById(id);
        return "ReservaHabitacion eliminada con éxito";
    }
}
