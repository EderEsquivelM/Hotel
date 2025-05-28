package org.example.hotel.Controladores;

import org.example.hotel.Entidades.VwHuesped;
import org.example.hotel.Entidades.vwHabitacionesDisponibles;
import org.example.hotel.Repositorios.VwHuespedRepository;
import org.example.hotel.Repositorios.vwHabitacionesDisponiblesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vwhabitacionesdisponibles")
public class vwHabitacionesDisponiblesController {

    @Autowired
    private vwHabitacionesDisponiblesRepository HabitacionesDisponiblesRepository;

    @GetMapping("")
    public @ResponseBody Iterable<vwHabitacionesDisponibles> getAll() {
        return HabitacionesDisponiblesRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody vwHabitacionesDisponibles getById(@PathVariable("id") Integer id) {
        return HabitacionesDisponiblesRepository.findById(id).orElse(null);
    }
}
