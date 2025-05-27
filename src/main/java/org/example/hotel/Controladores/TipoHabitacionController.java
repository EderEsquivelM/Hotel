package org.example.hotel.Controladores;

import org.example.hotel.Entidades.TipoHabitacion;
import org.example.hotel.Repositorios.TipoHabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tipohabitacion")
public class TipoHabitacionController {
    @Autowired
    private TipoHabitacionRepository tipoHabitacionRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<TipoHabitacion> getMunicipios() {
        return tipoHabitacionRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody TipoHabitacion getMunicipio(@PathVariable("id") Integer id) {
        return tipoHabitacionRepository.findById(id).orElse(null);
    }


}
