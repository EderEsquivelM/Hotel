package org.example.hotel.Controladores;

import org.example.hotel.Entidades.Habitacion;
import org.example.hotel.Repositorios.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/habitacion")
public class HabitacionController {
    @Autowired
    private HabitacionRepository habitacionRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Habitacion> getHabitaciones() {
        return habitacionRepository.findAll();

    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Habitacion getHabitacion(@PathVariable("id") Integer id) {
        return habitacionRepository.findById(id).orElse(null);
    }

}
