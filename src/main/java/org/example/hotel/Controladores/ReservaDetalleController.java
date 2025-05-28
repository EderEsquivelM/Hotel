package org.example.hotel.Controladores;

import org.example.hotel.Entidades.ReservaDetalle;
import org.example.hotel.Repositorios.ReservaDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/reservadetalle")
public class ReservaDetalleController {

    @Autowired
    private ReservaDetalleRepository reservaDetalleRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<ReservaDetalle> getReservaDetalles() {
        return reservaDetalleRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody ReservaDetalle getReservaDetalle(@PathVariable("id") Integer id) {
        return reservaDetalleRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "")
    public @ResponseBody String addReservaDetalle(@RequestBody ReservaDetalle reservaDetalle) {
        reservaDetalleRepository.save(reservaDetalle);
        return "ReservaDetalle agregado con éxito";
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updateReservaDetalle(@PathVariable("id") Integer id, @RequestBody ReservaDetalle reservaDetalle) {
        ReservaDetalle reservaDetalleViejo = reservaDetalleRepository.getReferenceById(id);
        reservaDetalleViejo.setReservaHabitacion(reservaDetalle.getReservaHabitacion());
        reservaDetalleViejo.setIdHuesped(reservaDetalle.getIdHuesped());
        reservaDetalleViejo.setEsResponsable(reservaDetalle.isEsResponsable());
        reservaDetalleRepository.save(reservaDetalleViejo);
        return "ReservaDetalle actualizado con éxito";
    }
}
