package org.example.hotel.Controladores;

import org.example.hotel.Entidades.Estado;
import org.example.hotel.Repositorios.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estado")
public class EstadoController {
    @Autowired
    private EstadoRepository estadoRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Estado> getEstados() {
        return estadoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Estado getEstado(@PathVariable("id") Integer id) {
        return estadoRepository.findById(id).orElse(null);
    }


}
