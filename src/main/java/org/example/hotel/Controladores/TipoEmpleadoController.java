package org.example.hotel.Controladores;

import org.example.hotel.Entidades.Huesped;
import org.example.hotel.Entidades.TipoEmpleado;
import org.example.hotel.Repositorios.TipoEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tipoempleado")
public class TipoEmpleadoController {
    @Autowired
    private TipoEmpleadoRepository tipoEmpleadoRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<TipoEmpleado> getTipoEmpleados() {
        return tipoEmpleadoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody TipoEmpleado getTipoEmpleado(@PathVariable("id") Integer id) {
        return tipoEmpleadoRepository.findById(id).orElse(null);
    }
}
